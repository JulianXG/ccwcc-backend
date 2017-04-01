package cn.kalyter.ccwcc.controller;

import cn.kalyter.ccwcc.model.Bird;
import cn.kalyter.ccwcc.model.Response;
import cn.kalyter.ccwcc.service.BirdService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Kalyter on 1/16/2017.
 */
@Api(description = "鸟类接口")
@Controller
public class BirdController {
    @Autowired
    private BirdService birdService;

    @ApiOperation(value = "上传鸟种接口")
    @ResponseBody
    @RequestMapping(value = "/role_admin/bird", method = RequestMethod.POST)
    public Response postBird(@RequestBody Bird bird) {
        return Response.OK(birdService.saveBird(bird));
    }

    @ApiOperation(value = "根据关键词搜索鸟类")
    @ResponseBody
    @RequestMapping(value = "/role_user/bird/brief", method = RequestMethod.GET)
    public Response postSearchBird() {
        return Response.OK(birdService.briefInfo());
    }

    @ApiOperation(value = "获取所有鸟类种类")
    @ResponseBody
    @RequestMapping(value = "/bird/category", method = RequestMethod.GET)
    public Response getCategory() {
        return Response.OK();
    }
}
