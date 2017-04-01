/**
 * Created by Kalyter on 12/27/2016.
 */
package cn.kalyter.ccwcc.service;

import cn.kalyter.ccwcc.model.BirdRecord;
import cn.kalyter.ccwcc.model.Flag;
import cn.kalyter.ccwcc.model.Pagination;
import cn.kalyter.ccwcc.model.Record;

import java.util.List;

public interface RecordService {
    int saveFlag(Flag flag);

    int saveRecord(Record record);

    Pagination<Record> getBirdPagination(int page, int pageSize, Record condition);

    Pagination<Flag> getFlagPagination(int page, int pageSize);

    List<Record> getStatistics(Record condition);
}
