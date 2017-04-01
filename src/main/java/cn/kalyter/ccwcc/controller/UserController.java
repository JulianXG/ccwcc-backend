package cn.kalyter.ccwcc.controller;

import cn.kalyter.ccwcc.model.*;
import cn.kalyter.ccwcc.service.TokenService;
import cn.kalyter.ccwcc.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kalyter on 12/18/2016.
 */
@Api(value = "user", description = "用户接口")
@Controller
//@RequestMapping("/role_user/user/")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;

    @ApiOperation(value = "用户登录接口", notes = "身份验证后，获取用户信息上下文以及token值")
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Response postLogin(@RequestBody User user) {
        User result = userService.login(user);
        Response response = new Response();
        if (result != null) {
            Token token = tokenService.getToken(result);
            Map<String, Object> data = new HashMap<>();
            data.put("token", token);
            data.put("user", result);
            response.setData(data);
            response.setStatus(Constant.OK);
        } else {
            response.setStatus(Constant.USERNAME_OR_PASSWORD_ERROR);
        }
        return response;
    }

    @ApiOperation(value = "用户注册接口")
    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Response postRegister(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        map.put("user", userService.register(user));
        return Response.OK(map);
    }

    @ApiOperation(value = "用户分页列表", notes = "用户分页，limitStart，limitEnd")
    @ResponseBody
    @RequestMapping(value = "/role_root/user/pagination/{page}/{pageSize}", method = RequestMethod.GET)
    public Response postUserPagination(@PathVariable("page") int page,
                                       @PathVariable("pageSize") int pageSize) {
        return Response.OK(userService.getUserPagination(page, pageSize).generateMap());
    }

    @ApiOperation(value = "注销当前用户", notes = "将当前用户持有的token注销")
    @ResponseBody
    @RequestMapping(value = "/role_admin/logout", method = RequestMethod.POST)
    public Response postLogout(String token) {
        tokenService.clearToken(token);
        return Response.OK();
    }
}
