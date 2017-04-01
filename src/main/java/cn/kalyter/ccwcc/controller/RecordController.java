/**
 * Created by Kalyter on 12/27/2016.
 */
package cn.kalyter.ccwcc.controller;

import cn.kalyter.ccwcc.model.*;
import cn.kalyter.ccwcc.service.RecordService;
import cn.kalyter.ccwcc.service.TokenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Api(description = "记录接口")
@Controller
//@Controller("/role_guest/record/")
public class RecordController {
    @Autowired
    private RecordService recordService;
    @Autowired
    private TokenService tokenService;

    @ApiOperation(value = "添加旗标记录")
    @ResponseBody
    @RequestMapping(value = "/role_user/record/flag", method = RequestMethod.POST)
    public Response postFlagRecord(@RequestBody Flag flag, @RequestHeader("token")String token) {
        User user = tokenService.getUserByToken(token);
        if (user != null) {
            flag.setUserId(user.getId());
            return Response.OK(recordService.saveFlag(flag));
        } else {
            return Response.STATUS(Constant.TOKEN_NOT_EXIST_OR_INVALID_ERROR);
        }
    }

    @ApiOperation(value = "添加鸟类记录")
    @ResponseBody
    @RequestMapping(value = "/role_user/record/bird", method = RequestMethod.POST)
    public Response postBirdRecordSave(@RequestBody Record record, @RequestHeader("token")String token) {
        User user = tokenService.getUserByToken(token);
        if (user != null) {
            record.setUserId(user.getId());
            return Response.OK(recordService.saveRecord(record));
        } else {
            return Response.STATUS(Constant.TOKEN_NOT_EXIST_OR_INVALID_ERROR);
        }
    }

    @ApiOperation(value = "获取记录分页")
    @ResponseBody
    @RequestMapping(value = "/record/bird/pagination/{page}/{pageSize}", method = RequestMethod.POST)
    public Response postPagination(@PathVariable("page") int page,
                                  @PathVariable("pageSize") int pageSize,
                                  @RequestBody Record condition) {
        return Response.OK(recordService.getBirdPagination(page, pageSize, condition).generateMap());
    }

    @ApiOperation(value = "获取统计记录数据")
    @ResponseBody
    @RequestMapping(value = "/record/statistics", method = RequestMethod.POST)
    public Response postStatistics() {
        return Response.OK();
    }
}
