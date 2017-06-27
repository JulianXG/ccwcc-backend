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
 * 用户controller，包含登录，注册，用户信息分页
 */
@Api(value = "user", description = "用户接口")
@Controller
//@RequestMapping("/role_user/user/")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;

    @ApiOperation(value = "忘记密码", notes = "验证邮箱之后，更改密码")
    @ResponseBody
    @RequestMapping(value = "/forgetPassword/{userId}/{password}", method = RequestMethod.GET)
    public Response postForgetPassword(@PathVariable("userId") int userId,
                                       @PathVariable("password") String password) {
        return Response.OK(userService.changePassword(userId, password));
    }

    @ApiOperation(value = "检查用户名是否重复")
    @ResponseBody
    @RequestMapping(value = "/username/check/{username}", method = RequestMethod.GET)
    public Response checkUsername(@PathVariable("username") String username) {
        return Response.OK(userService.checkUsername(username));
    }

    @ApiOperation(value = "检查用户名和邮箱")
    @ResponseBody
    @RequestMapping(value = "/username_email", method = RequestMethod.POST)
    public Response checkUsernameEmail(@RequestBody UserEmail userEmail) {
        return Response.OK(userService.checkUsernameEmail(userEmail));
    }

    @ApiOperation(value = "用户登录接口", notes = "身份验证后，获取用户信息上下文以及token值")
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Response postLogin(@RequestBody User user) {
        Response response = userService.login(user);
        if (response.getCode() == Constant.OK.getCode()) {
            User handleUser = (User) response.getData();
            Token token = tokenService.getToken(handleUser);
            Map<String, Object> data = new HashMap<>();
            data.put("token", token);
            data.put("user", handleUser);
            response.setData(data);
            response.setStatus(Constant.OK);
        }
        return response;
    }

    @ApiOperation(value = "用户注册")
    @ResponseBody
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public Response postRegister(@RequestBody User user) {
        User register = userService.register(user);
        if (register != null) {
            Map<String, Object> map = new HashMap<>();
            map.put("user", register);
            return Response.OK(map);
        } else {
            return Response.STATUS(Constant.ERROR);
        }
    }

    @ApiOperation(value = "超级管理员更改用户接口")
    @ResponseBody
    @RequestMapping(value = "/role_root/users", method = RequestMethod.PUT)
    public Response putUsers(@RequestBody User user) {
        return Response.OK(userService.update(user));
    }

    @ApiOperation(value = "超级管理员更改用户接口")
    @ResponseBody
    @RequestMapping(value = "/role_root/users/{id}", method = RequestMethod.POST)
    public Response update(@PathVariable("id")int id, @RequestBody User user) {
        user.setId(id);
        return Response.OK(userService.update(user));
    }

    @ApiOperation(value = "超级管理员获取用户接口")
    @ResponseBody
    @RequestMapping(value = "/role_root/users/{id}", method = RequestMethod.GET)
    public Response get(@PathVariable("id")int id) {
        return Response.OK(userService.get(id));
    }

    @ApiOperation(value = "超级管理员删除用户接口")
    @ResponseBody
    @RequestMapping(value = "/role_root/users/delete/{id}", method = RequestMethod.GET)
    public Response delete(@PathVariable("id") int id) {
        return Response.OK(userService.delete(id));
    }

    @ApiOperation(value = "用户分页列表", notes = "用户分页")
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
