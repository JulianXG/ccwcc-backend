package cn.kalyter.ccwcc.service.impl;

import cn.kalyter.ccwcc.dao.CheckpointMapper;
import cn.kalyter.ccwcc.dao.UserCheckpointMapper;
import cn.kalyter.ccwcc.model.Checkpoint;
import cn.kalyter.ccwcc.model.CheckpointExample;
import cn.kalyter.ccwcc.model.UserCheckpoint;
import cn.kalyter.ccwcc.model.UserCheckpointExample;
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

    @Autowired
    private UserCheckpointMapper userCheckpointMapper;

    @Override
    public List<Checkpoint> getBrief() {
        CheckpointExample example = new CheckpointExample();
        example.or().andIsDeletedEqualTo(false);
        return checkpointMapper.selectByExample(example);
    }

    @Override
    public List<UserCheckpoint> getCheckpointsByUserId(int userId) {
        UserCheckpointExample example = new UserCheckpointExample();
        example.or().andUserIdEqualTo(userId);
        return userCheckpointMapper.selectByExample(example);
    }

    @Override
    public int changeUserCheckpoints(int userId, List<Integer> checkpoints) {
        int result = 0;
        for (Integer checkpointId : checkpoints) {
            UserCheckpoint userCheckpoint = new UserCheckpoint();
            userCheckpoint.setUserId(userId);
            Checkpoint checkpoint = checkpointMapper.selectByPrimaryKey(checkpointId);
            userCheckpoint.setCheckpointId(checkpointId);
            userCheckpoint.setCheckpointName(checkpoint.getName());

            UserCheckpointExample userCheckpointExample = new UserCheckpointExample();
            userCheckpointExample.or().andUserIdEqualTo(userId).andCheckpointIdEqualTo(checkpointId);
            List<UserCheckpoint> alreadyExist = userCheckpointMapper.selectByExample(userCheckpointExample);
            if (alreadyExist.size() == 0) {
                // 还没有插入，插入
                result += userCheckpointMapper.insert(userCheckpoint);
            }
        }
        return result;
    }
}
