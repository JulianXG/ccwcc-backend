package cn.kalyter.ccwcc.dao;

import cn.kalyter.ccwcc.model.ValidateCode;
import cn.kalyter.ccwcc.model.ValidateCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface ValidateCodeMapper {
    int countByExample(ValidateCodeExample example);

    int insert(ValidateCode record);

    int insertSelective(ValidateCode record);

    List<ValidateCode> selectByExample(ValidateCodeExample example);

    ValidateCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ValidateCode record, @Param("example") ValidateCodeExample example);

    int updateByExample(@Param("record") ValidateCode record, @Param("example") ValidateCodeExample example);

    int updateByPrimaryKeySelective(ValidateCode record);

    int updateByPrimaryKey(ValidateCode record);
}
