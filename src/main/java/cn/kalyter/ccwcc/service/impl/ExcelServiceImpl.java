package cn.kalyter.ccwcc.service.impl;

import cn.kalyter.ccwcc.common.Config;
import cn.kalyter.ccwcc.dao.BirdMapper;
import cn.kalyter.ccwcc.dao.RecordMapper;
import cn.kalyter.ccwcc.model.Bird;
import cn.kalyter.ccwcc.model.Pagination;
import cn.kalyter.ccwcc.model.Record;
import cn.kalyter.ccwcc.model.RecordExample;
import cn.kalyter.ccwcc.service.ExcelService;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by liberty on 2017/4/27.
 */
@Service
public class ExcelServiceImpl implements ExcelService {
	@Autowired
	private BirdMapper birdMapper;
	@Autowired
	private RecordMapper recordMapper;

	/**对Excel表进行操作*/
	public Workbook createExcel(List<Bird> nameList, Date startDate, Date endDate, String keyword, int checkpointId){
        if (startDate == null) {
            startDate = birdMapper.getEarliestDate(keyword, checkpointId);
        }
        if (endDate == null) {
            endDate = birdMapper.getOldestDate(keyword, checkpointId);
        }
		Date addDate = startDate;
		Date flag;
		List<Date> dateList = new ArrayList<>(); //月份列表
		List<List<Bird>> birdCounts = new ArrayList<>();//获取到每个月的各个鸟类数量
        while (addDate.before(endDate)) {
            flag = addDate;
			dateList.add(addDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(addDate);
			calendar.add(Calendar.MONTH,1);//实现月份+1
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.set(Calendar.HOUR, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
			addDate = calendar.getTime();
			List<Bird> result = getBirdListByMonth(flag,addDate,keyword, checkpointId);
			birdCounts.add(result);
		}
		Workbook wb = null;
		try {
			wb = new XSSFWorkbook();
			Sheet sheet = wb.createSheet("sheet");
			//创建新的一行
			int currentLastRowIndex= sheet.getLastRowNum();
			Row newRow = sheet.createRow(currentLastRowIndex);
			int cellIndex = 0;
			//日期格式
			CellStyle dateCellStyle= wb.createCellStyle();
			short df = wb.createDataFormat().getFormat("yyyy-MM");
			dateCellStyle.setDataFormat(df);

			//第一行 前面两个为空单元格
			newRow.createCell(cellIndex++, CellType.STRING)
					.setCellValue("鸟种分类");
			newRow.createCell(cellIndex++, CellType.STRING)
					.setCellValue("鸟种名称");
			for(Date date : dateList){
				Cell cell = newRow.createCell(cellIndex, CellType.NUMERIC);
				sheet.setColumnWidth(cellIndex, 15 * 256);
				cellIndex++;
				cell.setCellValue(date);
				cell.setCellStyle(dateCellStyle);
			}
			int currentRow = currentLastRowIndex + 1;
            for (Bird aNameList : nameList) {
                Row nextRow = sheet.createRow(currentRow++);
                cellIndex = 0;
                Cell cellLine1 = nextRow.createCell(cellIndex++, CellType.STRING);
                cellLine1.setCellValue(aNameList.getCategory());
                Cell cellLine2 = nextRow.createCell(cellIndex, CellType.STRING);
                cellLine2.setCellValue(aNameList.getNameZh());
                sheet.setColumnWidth(cellIndex++, 15 * 256);
                for (int l = 0; l < dateList.size(); l++) {//创建日期下面的鸟类数量单元格,先建好默认值为0，下次直接访问到 往里面加入数据
                    nextRow.createCell(cellIndex++, CellType.NUMERIC)
                            .setCellValue(0);
                }
            }

			for(int i=0; i<birdCounts.size(); i++){//遍历每一个月份的鸟类
				List<Bird> line = birdCounts.get(i);
                for (Bird aLine : line) {//遍历这个月份的所有鸟类
                    for (int k = 0; k < nameList.size(); k++) {//与nameList的鸟类名字比较
                        if (aLine.getNameZh().equals(nameList.get(k).getNameZh())) {
                            sheet.getRow(k + 1).getCell(i + 2).setCellValue(aLine.getBirdCount());
                            break;
                        }
                    }
                }
			}

		} catch (Exception ignored){

		}
		return wb;
	}

    @Override
	public List<Bird> getExcelData(String keyword) {
		return birdMapper.getExcelData(keyword);
	}

	@Override
	public List<Bird> getNameList(Date startDate, Date endDate, String keyword, int checkpointId) {
        return birdMapper.getBirdName(startDate,endDate,keyword, null, null, checkpointId);
	}

    @Override
    public Pagination<Bird> getPagination(Date startTime, Date endTime, String keyword,
                                          int page, int pageSize, int checkpointId) {
		Pagination<Bird> pagination = new Pagination<>();
        List<Bird> allBird = getNameList(startTime, endTime, keyword, checkpointId);
        pagination.setPage(page);
        pagination.setPageSize(pageSize);
        pagination.setTotal(allBird.size());
        pagination.setRows(allBird.subList(pageSize * (page - 1) , pageSize));
        return pagination;
    }

    /**逐月获取鸟类信息*/
    @Override
	public List<Bird> getBirdListByMonth(Date startDate, Date endDate,String keyword, int checkpointId) {
		return birdMapper.getBirdListByMonth(startDate,endDate,keyword, checkpointId);
	}

    @Override
    public Pagination<Map<String, Object>> getRawData(Date startTime, Date endTime, String keyword,
                                                      int page, int pageSize, int checkpointId) {
        // 如果startTime和endTime不存在默认就是全局的
        Pagination<Map<String, Object>> pagination = new Pagination<>();
        if (startTime == null) {
            startTime = birdMapper.getEarliestDate(keyword, checkpointId);
        }
        if (endTime == null) {
            endTime = birdMapper.getOldestDate(keyword, checkpointId);
        }

        // 设置分页的一些基本值
        int total = birdMapper.countBirds(startTime, endTime, keyword, checkpointId);
        pagination.setTotal(total);
        pagination.setPage(page);
        pagination.setPageSize(pageSize);
        List<Map<String, Object>> lists = new ArrayList<>();

        // 判断总量是否为0，如果为零直接返回
        if (total > 0)  {
            List<String> timeRange = new ArrayList<>();
            Map<String, Object> timeMap = new HashMap<>();
            timeMap.put("timeRange", timeRange);
            lists.add(timeMap);

            List<Bird> birds = birdMapper.getBirdName(startTime, endTime,
                    keyword, (page - 1) * pageSize, pageSize, checkpointId);
            for (Bird bird : birds) {
                Map<String, Object> map =new HashMap<>();
                map.put("name", bird.getNameZh());
                lists.add(map);
            }
            Calendar calendar = Calendar.getInstance();

            Date increment = startTime;
            while (increment.before(endTime)) {
                String timeFormat = Config.yyyyMM.format(increment);
                timeRange.add(timeFormat);
                calendar.setTime(increment);
                calendar.add(Calendar.MONTH, 1);
                calendar.set(Calendar.DAY_OF_MONTH, 1);
                calendar.set(Calendar.HOUR, 0);
                calendar.set(Calendar.MINUTE, 0);
                calendar.set(Calendar.SECOND, 0);
                Date nextTime = calendar.getTime();
                List<Bird> tmpBirds = birdMapper.getBirdListByMonth(increment, nextTime, keyword, checkpointId);
                for (Bird bird : tmpBirds) {
                    for (Map<String, Object> map : lists) {
                        if (map.containsKey("name") &&
                                map.get("name").equals(bird.getNameZh())) {
                            map.put(timeFormat, bird.getBirdCount());
                            break;
                        }
                    }
                }
                increment = nextTime;
            }

            pagination.setRows(lists);
        }
        return pagination;
    }
}
