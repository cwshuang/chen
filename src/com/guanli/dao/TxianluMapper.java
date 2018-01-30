package com.guanli.dao;

import com.guanli.pojo.Txianlu;
import com.guanli.pojo.TxianluExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TxianluMapper {
    int countByExample(TxianluExample example);

    int deleteByExample(TxianluExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Txianlu record);

    int insertSelective(Txianlu record);

    List<Txianlu> selectByExample(TxianluExample example);

    Txianlu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Txianlu record, @Param("example") TxianluExample example);

    int updateByExample(@Param("record") Txianlu record, @Param("example") TxianluExample example);

    int updateByPrimaryKeySelective(Txianlu record);

    int updateByPrimaryKey(Txianlu record);
}