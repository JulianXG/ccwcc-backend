package cn.kalyter.ccwcc.dao;

import cn.kalyter.ccwcc.model.Flag;
import cn.kalyter.ccwcc.model.FlagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface FlagMapper {
    int countByExample(FlagExample example);

    int insert(Flag record);

    int insertSelective(Flag record);

    List<Flag> selectByExample(FlagExample example);

    Flag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Flag record, @Param("example") FlagExample example);

    int updateByExample(@Param("record") Flag record, @Param("example") FlagExample example);

    int updateByPrimaryKeySelective(Flag record);

    int updateByPrimaryKey(Flag record);
}