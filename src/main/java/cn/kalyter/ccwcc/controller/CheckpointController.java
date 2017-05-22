package cn.kalyter.ccwcc.controller;

import cn.kalyter.ccwcc.model.Response;
import cn.kalyter.ccwcc.service.CheckpointService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @ApiOperation(value = "根据用户获取用户的检查地")
    @ResponseBody
    @RequestMapping(value = "/checkpoints/user/{userId}", method = RequestMethod.GET)
    public Response getCheckpointsByUserId(@PathVariable("userId") int userId) {
        return Response.OK(checkpointService.getCheckpointsByUserId(userId));
    }

    @ApiOperation(value = "更改用户检查地")
    @ResponseBody
    @RequestMapping(value = "/checkpoints/user/{userId}", method = RequestMethod.POST)
    public Response postUserCheckpoints(@PathVariable("userId") int userId,
                                        @RequestBody List<Integer> checkpoints) {
        return Response.OK(checkpointService.changeUserCheckpoints(userId, checkpoints));
    }
}
