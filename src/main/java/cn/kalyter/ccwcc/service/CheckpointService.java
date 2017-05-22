package cn.kalyter.ccwcc.service;

import cn.kalyter.ccwcc.model.Checkpoint;
import cn.kalyter.ccwcc.model.UserCheckpoint;

import java.util.List;

/**
 * Created by Kalyter on 1/23/2017.
 */
public interface CheckpointService {
    List<Checkpoint> getBrief();

    List<UserCheckpoint> getCheckpointsByUserId(int userId);

    int changeUserCheckpoints(int userId, List<Integer> checkpoints);
}
