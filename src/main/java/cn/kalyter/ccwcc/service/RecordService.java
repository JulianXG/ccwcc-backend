/**
 * Created by Kalyter on 12/27/2016.
 */
package cn.kalyter.ccwcc.service;

import cn.kalyter.ccwcc.model.*;

import java.util.List;

public interface RecordService {
    ChartData<Double> getMapData();

    List<Record> getRecordByKeywords(String keywords);

    int saveFlag(Flag flag);

    int saveRecord(Record record);

    int saveRecords(List<Record> records);

    Pagination<Record> getBirdPagination(int page, int pageSize, Record condition);

    Pagination<Flag> getFlagPagination(int page, int pageSize);

    List<Record> getStatistics(Record condition);
}
