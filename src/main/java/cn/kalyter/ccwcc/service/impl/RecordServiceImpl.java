/**
 * Created by Kalyter on 12/27/2016.
 */
package cn.kalyter.ccwcc.service.impl;

import cn.kalyter.ccwcc.dao.BirdMapper;
import cn.kalyter.ccwcc.dao.FlagMapper;
import cn.kalyter.ccwcc.dao.RecordMapper;
import cn.kalyter.ccwcc.model.*;
import cn.kalyter.ccwcc.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.REException;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;
    @Autowired
    private FlagMapper flagMapper;
    @Autowired
    private BirdMapper birdMapper;

    @Override
    public ChartData<Double> getMapData() {
        return null;
    }

    @Override
    public List<Record> getRecordByKeywords(String keywords) {

        return null;
    }

    @Override
    public int saveFlag(Flag flag) {
        flag.setLd(flag.getLd().equals("") ? null : flag.getLd());
        flag.setLu(flag.getLu().equals("") ? null : flag.getLu());
        flag.setRd(flag.getRd().equals("") ? null : flag.getRd());
        flag.setRu(flag.getRu().equals("") ? null : flag.getRu());
        return flagMapper.insertSelective(flag);
    }

    @Override
    public int saveRecord(Record record) {
        int result = 0;
        if (record.getBirds() != null) {
            for (BirdRecord item : record.getBirds()) {
                record.setBirdId(item.getId());
                record.setBirdCount(item.getCount());
                result += recordMapper.insertSelective(record);
            }
        }
        return result;
    }

    @Override
    public int saveRecords(List<Record> records) {
        int result = 0;
        for (Record record : records) {
            result += saveRecord(record);
        }
        return result;
    }

    @Override
    public Pagination<Record> getBirdPagination(int page, int pageSize, Record condition) {
        Pagination<Record> result = new Pagination<>();
        RecordExample example = new RecordExample();
        example.or().andIsDeletedEqualTo(false);
        result.setTotal(recordMapper.countByExample(example));
        example.setLimitStart((page - 1) * pageSize);
        example.setLimitEnd(pageSize);
        if (condition != null) {
            example.or()
                    .andBirdIdEqualTo(condition.getId())
                    .andUserIdEqualTo(condition.getUserId())
                    .andBirdCountLessThanOrEqualTo(condition.getBirdCount())
                    .andDetailLike(condition.getDetail())
                    .andWeatherLike(String.format("%%%s%%", condition.getWeather()))
                    .andRecordTimeEqualTo(condition.getRecordTime());
        }
        List<Record> list = recordMapper.selectByExample(example);
        result.setRows(list);
        result.setPage(page);
        result.setPageSize(pageSize);
        return result;
    }

    @Override
    public Pagination<Flag> getFlagPagination(int page, int pageSize) {
        Pagination<Flag> result = new Pagination<>();
        FlagExample example = new FlagExample();
        example.or().andIsDeletedEqualTo(false);
        int total = flagMapper.countByExample(example);
        example.setLimitStart((page - 1) * pageSize);
        example.setLimitEnd(pageSize);
        List<Flag> rows = flagMapper.selectByExample(example);
        result.setTotal(total);
        result.setPage(page);
        result.setPageSize(pageSize);
        result.setRows(rows);
        return result;
    }

    @Override
    public List<Record> getStatistics(Record condition) {
        return null;
    }
}
