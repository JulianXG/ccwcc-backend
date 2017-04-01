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
    public int saveFlag(Flag flag) {
        return flagMapper.insertSelective(flag);
    }

    @Override
    public int saveRecord(Record record) {
        int result = 0;
        if (record.getBirds() != null) {
            for (BirdRecord item : record.getBirds()) {
                Bird bird = birdMapper.selectByPrimaryKey(item.getId());
                record.setBirdId(item.getId());
                record.setBirdCount(item.getCount());
                record.setCategory(bird.getCategory());
                record.setSpecies(bird.getNameZh());
                result += recordMapper.insertSelective(record);
            }
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
                    .andPositionLike(String.format("%%%s%%", condition.getPosition()))
                    .andDetailLike(condition.getDetail())
                    .andLonEqualTo(condition.getLon())
                    .andLatEqualTo(condition.getLat())
                    .andCategoryEqualTo(condition.getCategory())
                    .andSpeciesEqualTo(condition.getSpecies())
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
