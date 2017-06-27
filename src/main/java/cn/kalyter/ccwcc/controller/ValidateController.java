package cn.kalyter.ccwcc.controller;

import cn.kalyter.ccwcc.model.*;
import cn.kalyter.ccwcc.service.MailService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Kalyter on 2017-6-13 0013.
 */
@Controller
public class ValidateController {
    @Autowired
    private MailService mailService;

    @ApiOperation("发送验证码")
    @RequestMapping(path = "/validate_code/send/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Response validateCode(@PathVariable("userId") int userId) {
        try {
            mailService.sendValidateCodeMail(userId);
            return Response.OK();
        } catch (Exception e) {
            return Response.ERROR();
        }
    }

    @ApiOperation("检测验证码")
    @RequestMapping(value = "/validate_code/verify/{userId}/{code}", method = RequestMethod.GET)
    @ResponseBody
    public Response verifyCode(@PathVariable("userId") int userId,
                               @PathVariable("code") String code) {
        boolean result = mailService.verifyValidateCode(userId, code);
        String message;
        if (result) {
            message = "账号激活成功";
        } else {
            message = "验证码验证出错";
        }
        return Response.OK(message);
    }
}
