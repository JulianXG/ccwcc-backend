package cn.kalyter.ccwcc.dao;

import cn.kalyter.ccwcc.model.Checkpoint;
import cn.kalyter.ccwcc.model.CheckpointExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CheckpointMapper {
    int countByExample(CheckpointExample example);

    int insert(Checkpoint record);

    int insertSelective(Checkpoint record);

    List<Checkpoint> selectByExample(CheckpointExample example);

    Checkpoint selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Checkpoint record, @Param("example") CheckpointExample example);

    int updateByExample(@Param("record") Checkpoint record, @Param("example") CheckpointExample example);

    int updateByPrimaryKeySelective(Checkpoint record);

    int updateByPrimaryKey(Checkpoint record);
}