package cn.kalyter.ccwcc.service;

import javax.mail.internet.MimeMessage;

/**
 * Created by Kalyter on 2017-6-12 0012.
 */
public interface MailService {
    void sendValidateLinkMail(int userId) throws Exception;

    void sendValidateCodeMail(int userId) throws Exception;

    boolean verifyValidateCode(int userId, String validateCode);

    void sendEmail(String email, String message) throws Exception;
}
