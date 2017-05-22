package cn.kalyter.ccwcc.dao;

import cn.kalyter.ccwcc.model.UserCheckpoint;
import cn.kalyter.ccwcc.model.UserCheckpointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public interface UserCheckpointMapper {
    int countByExample(UserCheckpointExample example);

    int insert(UserCheckpoint record);

    int insertSelective(UserCheckpoint record);

    List<UserCheckpoint> selectByExample(UserCheckpointExample example);

    UserCheckpoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserCheckpoint record, @Param("example") UserCheckpointExample example);

    int updateByExample(@Param("record") UserCheckpoint record, @Param("example") UserCheckpointExample example);

    int updateByPrimaryKeySelective(UserCheckpoint record);

    int updateByPrimaryKey(UserCheckpoint record);
}