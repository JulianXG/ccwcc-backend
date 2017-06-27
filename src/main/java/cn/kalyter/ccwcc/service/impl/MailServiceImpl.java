package cn.kalyter.ccwcc.service.impl;

import cn.kalyter.ccwcc.common.Config;
import cn.kalyter.ccwcc.dao.UserMapper;
import cn.kalyter.ccwcc.dao.ValidateCodeMapper;
import cn.kalyter.ccwcc.model.User;
import cn.kalyter.ccwcc.model.UserExample;
import cn.kalyter.ccwcc.model.ValidateCode;
import cn.kalyter.ccwcc.model.ValidateCodeExample;
import cn.kalyter.ccwcc.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.print.attribute.standard.MediaSize;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;

/**
 * Created by Kalyter on 2017-6-12 0012.
 */
@Service
public class MailServiceImpl implements MailService {
    @Autowired
    private ValidateCodeMapper validateCodeMapper;
    @Autowired
    private UserMapper userMapper;

    private String mEmailAccount = "ccwcc_official@163.com";
    private static final String NAME = "中国水鸟调查";
    private String mEmailPassword = "2017ccwcc";
    private static String mEmailSMTPHost = "smtp.163.com";
    private static String mReceiveMailAccount = "xiaogangla@qq.com";
    private static final String URL = "http://ccwcc.ebirdnote.cn/api/validate_code/verify";
//    private static final String URL = "http:///localhost:8080/api/validate_code/verify";

    @Override
    public void sendValidateLinkMail(int userId) throws Exception {
        UUID uuid = UUID.randomUUID();
        String message = String.format("访问网址激活你的邮箱账号， %d小时内有效！<a href=\"%s/%s/%s\">点我激活</a>",
                Config.VALIDATE_LINK_EXPIRE_MINUTE / 60, URL, userId, uuid.toString());
        ValidateCode validateCode = new ValidateCode();
        validateCode.setUserId(userId);
        validateCode.setCode(uuid.toString());
        validateCode.setExpireTime(Config.VALIDATE_LINK_EXPIRE_MINUTE);
        validateCode.setRequestTime(new Date());
        validateCodeMapper.insertSelective(validateCode);
        User user = userMapper.selectByPrimaryKey(userId);
        sendEmail(user.getEmail(), message);
    }

    @Override
    public void sendValidateCodeMail(int userId) throws Exception{
        String validateCode = String.format("%06d", (int) (Math.random() * 1000000));;
        ValidateCode validateCodeModel = new ValidateCode();
        validateCodeModel.setCode(validateCode);
        validateCodeModel.setUserId(userId);
        validateCodeModel.setRequestTime(new Date());
        validateCodeModel.setExpireTime(Config.VALIDATE_CODE_EXPIRE_MINUTE);
        validateCodeMapper.insertSelective(validateCodeModel);
        User user = userMapper.selectByPrimaryKey(userId);
        String email = user.getEmail();
        String code = String.format("尊敬的用户您好，您的验证码是%s，%d分钟内有效，请妥善保管你的验证码！",
                validateCode, Config.VALIDATE_CODE_EXPIRE_MINUTE);
        sendEmail(email, code);
    }

    @Override
    public boolean verifyValidateCode(int userId, String validateCode) {
        ValidateCodeExample example = new ValidateCodeExample();
        example.setLimitStart(0);
        example.setLimitEnd(1);
        example.setOrderByClause("request_time DESC");
        example.or().andUserIdEqualTo(userId);
        List<ValidateCode> result = validateCodeMapper.selectByExample(example);
        if (result != null && result.size() > 0) {
            ValidateCode code = result.get(0);
            Date requestTime = code.getRequestTime();
            int expireMinutes = code.getExpireTime();
            if (requestTime.getTime() + expireMinutes * 60 * 1000 > new Date().getTime()) {
                String realCode = code.getCode();
                if (realCode.equals(validateCode)) {
                    // 认证成功，激活账户
                    UserExample userExample = new UserExample();
                    userExample.or().andIdEqualTo(userId);
                    List<User> users = userMapper.selectByExample(userExample);
                    assert users.size() == 0;
                    User user = users.get(0);
                    user.setStatus(Config.USER_AVAILABLE);
                    userMapper.updateByPrimaryKey(user);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void sendEmail(String email, String message) throws Exception {
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.smtp.host", mEmailSMTPHost);
        properties.setProperty("mail.smtp.auth", "true");
        if (email == null) {
            email = mReceiveMailAccount;
        }
        Session session = Session.getDefaultInstance(properties);

        MimeMessage mimeMessage = new MimeMessage(session);
        mimeMessage.setFrom(new InternetAddress(mEmailAccount, NAME, "UTF-8"));
        mimeMessage.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(email));
        mimeMessage.setSubject("官方邮件");
        mimeMessage.setContent(message,  "text/html;charset=UTF-8");
        mimeMessage.setSentDate(new Date());
        mimeMessage.saveChanges();
        Transport transport = session.getTransport();
        transport.connect(mEmailAccount, mEmailPassword);
        transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());
        transport.close();
    }
}
