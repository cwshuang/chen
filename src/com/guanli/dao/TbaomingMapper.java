package com.guanli.dao;

import com.guanli.pojo.Tbaoming;
import com.guanli.pojo.TbaomingExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TbaomingMapper {
    int countByExample(TbaomingExample example);

    int deleteByExample(TbaomingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tbaoming record);

    int insertSelective(Tbaoming record);

    List<Tbaoming> selectByExample(TbaomingExample example);

    Tbaoming selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tbaoming record, @Param("example") TbaomingExample example);

    int updateByExample(@Param("record") Tbaoming record, @Param("example") TbaomingExample example);

    int updateByPrimaryKeySelective(Tbaoming record);

    int updateByPrimaryKey(Tbaoming record);
    
    List<Tbaoming> selectTbaomingByUserTel(String usertel);
}