package cn.kalyter.ccwcc.service;

import cn.kalyter.ccwcc.model.Bird;
import cn.kalyter.ccwcc.model.Pagination;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by liberty on 2017/4/27.
 */
public interface ExcelService {
	Workbook createExcel(List<Bird> nameList, Date startDate, Date endDate, String keyword, int checkpointId);

	List<Bird> getExcelData(String keyword);

	List<Bird> getNameList(Date startDate, Date endDate, String keyword, int checkpointId);

    Pagination<Bird> getPagination(Date startTime, Date endTime, String keyword,
                                   int page, int pageSize, int checkpointId);

    List<Bird> getBirdListByMonth(Date startDate, Date endDate, String keyword, int checkpointId);

    Pagination<Map<String, Object>> getRawData(Date startTime, Date endTime, String keyword,
                                               int page, int pageSize, int checkpointId);
}
