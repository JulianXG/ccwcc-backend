package cn.kalyter.ccwcc.controller;

import cn.kalyter.ccwcc.model.Response;
import cn.kalyter.ccwcc.service.CheckpointService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Kalyter on 1/23/2017.
 */
@Api(description = "检查地相关接口")
@Controller
public class CheckpointController {
    @Autowired
    private CheckpointService checkpointService;

    @ApiOperation(value = "取出所有检查地")
    @RequestMapping(value = "/checkpoint/brief", method = RequestMethod.GET)
    @ResponseBody
    public Response getBrief() {
        return Response.OK(checkpointService.getBrief());
    }
}
