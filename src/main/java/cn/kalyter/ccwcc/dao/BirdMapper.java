package cn.kalyter.ccwcc.dao;

import cn.kalyter.ccwcc.model.Bird;
import cn.kalyter.ccwcc.model.BirdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BirdMapper {
    int countByExample(BirdExample example);

    int deleteByExample(BirdExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bird record);

    int insertSelective(Bird record);

    List<Bird> selectByExample(BirdExample example);

    Bird selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bird record, @Param("example") BirdExample example);

    int updateByExample(@Param("record") Bird record, @Param("example") BirdExample example);

    int updateByPrimaryKeySelective(Bird record);

    int updateByPrimaryKey(Bird record);
}