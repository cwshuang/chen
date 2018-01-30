package com.guanli.dao;

import com.guanli.pojo.Tliuyan;
import com.guanli.pojo.TliuyanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TliuyanMapper {
    int countByExample(TliuyanExample example);

    int deleteByExample(TliuyanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tliuyan record);

    int insertSelective(Tliuyan record);

    List<Tliuyan> selectByExample(TliuyanExample example);

    Tliuyan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tliuyan record, @Param("example") TliuyanExample example);

    int updateByExample(@Param("record") Tliuyan record, @Param("example") TliuyanExample example);

    int updateByPrimaryKeySelective(Tliuyan record);

    int updateByPrimaryKey(Tliuyan record);
    
    int insertliuayn(Tliuyan tliuyan);
    int updatethuifu(Tliuyan tliuyan);
}