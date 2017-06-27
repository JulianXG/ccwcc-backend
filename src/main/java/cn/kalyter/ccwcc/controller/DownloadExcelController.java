package cn.kalyter.ccwcc.controller;

import cn.kalyter.ccwcc.common.Config;
import cn.kalyter.ccwcc.model.Constant;
import cn.kalyter.ccwcc.model.KeywordMiddle;
import cn.kalyter.ccwcc.model.Response;
import cn.kalyter.ccwcc.model.Bird;
import cn.kalyter.ccwcc.service.ExcelService;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by liberty on 2017/4/27.
 */
@Controller
public class DownloadExcelController {
	@Autowired
	private ExcelService excelService;

	@ApiOperation("将数据库数据插入excel")
	@ResponseBody
	@RequestMapping(value = "/excel/download" ,method = RequestMethod.GET)
	public Response getExcelData(@RequestParam(value = "keyword", required = false) String keyword,
                                 @RequestParam(value = "startTime", required = false) String startTimeContent,
                                 @RequestParam(value = "endTime", required = false) String endTimeContent,
                                 @RequestParam("checkpointId") int checkpointId,
                                 HttpServletResponse response) {
        // FIXME: 2017-5-22 0022 在这里对于Jackson里面对于Date字符串的解析，
        // 反序列化，真的是头疼，现在我自己手动来解析
        try {
            Date startTime = null;
            Date endTime = null;
            if (startTimeContent != null && !startTimeContent.equals("")) {
                startTime = Config.yyyyMMddHHmmss.parse(startTimeContent);
            }
            if (endTimeContent != null && !endTimeContent.equals("")) {
                endTime = Config.yyyyMMddHHmmss.parse(endTimeContent);
            }
            List<Bird> nameList = excelService.getNameList(startTime, endTime, keyword, checkpointId);
            if (nameList != null && nameList.size() > 0) {
                Workbook workbook = excelService.createExcel(nameList, startTime, endTime, keyword, checkpointId);

                ByteArrayOutputStream os = new ByteArrayOutputStream();
                workbook.write(os);
                byte[] content = os.toByteArray();
//            String excelPath = String.format("%s-%s.xlsx",
//                    Config.yyyyMM.format(startTime), Config.yyyyMM.format(endTime));
                // 设置response参数，可以打开下载页面
                response.reset();
                response.setContentType("application/vnd.ms-excel;charset=utf-8");
                response.setHeader("Content-Disposition", "attachment;filename=" +
                        new String("data.xlsx".getBytes(), "iso-8859-1"));
                response.setContentLength(content.length);
                response.getOutputStream().write(content);
                response.getOutputStream().flush();
                response.getOutputStream().close();
            } else {
                return Response.OK("暂无任何数据");
            }

		}catch (Exception e){
			return Response.STATUS(Constant.ERROR);
		}
		return Response.OK();
	}

	@ApiOperation("根据关键词和时间段，获取记录数据")
	@ResponseBody
	@RequestMapping(value = "/role_user/excel/search/{checkpointId}/{page}/{pageSize}", method = RequestMethod.POST)
	public Response search(@RequestBody KeywordMiddle keywordMiddle,
						   @PathVariable("pageSize") int pageSize,
						   @PathVariable("page") int page,
                           @PathVariable("checkpointId") int checkpointId) {
		return Response.OK(excelService.getRawData(keywordMiddle.getStartTime(),
				keywordMiddle.getEndTime(), keywordMiddle.getKeyword(), page, pageSize, checkpointId));
	}
}
