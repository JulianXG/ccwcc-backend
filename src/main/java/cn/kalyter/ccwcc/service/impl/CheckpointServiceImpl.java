package cn.kalyter.ccwcc.service.impl;

import cn.kalyter.ccwcc.dao.CheckpointMapper;
import cn.kalyter.ccwcc.model.Checkpoint;
import cn.kalyter.ccwcc.model.CheckpointExample;
import cn.kalyter.ccwcc.service.CheckpointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Kalyter on 1/23/2017.
 */
@Service
public class CheckpointServiceImpl implements CheckpointService {
    @Autowired
    private CheckpointMapper checkpointMapper;

    @Override
    public List<Checkpoint> getBrief() {
        CheckpointExample example = new CheckpointExample();
        example.or().andIsDeletedEqualTo(false);
        return checkpointMapper.selectByExample(example);
    }
}
