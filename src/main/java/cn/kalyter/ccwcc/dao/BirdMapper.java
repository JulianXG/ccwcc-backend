package cn.kalyter.ccwcc.dao;

import cn.kalyter.ccwcc.model.Bird;
import cn.kalyter.ccwcc.model.BirdExample;
import cn.kalyter.ccwcc.model.Record;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

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

    List<Bird> getExcelData(@Param("keyword") String keyword);

    List<Bird> getBirdName(@Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("keyword") String keyword, @Param("beginIndex") Integer beginIndex, @Param("pageSize") Integer pageSize);

    int countBirds(@Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("keyword") String keyword);

	List<Bird> getBirdListByMonth(@Param("startDate") Date startDate, @Param("endDate") Date endDate, @Param("keyword") String keyword);

    Date getEarliestDate(@Param("keyword") String keyword);

    Date getOldestDate(@Param("keyword") String keyword);

    List<String> getCategories(String keyword);
}
