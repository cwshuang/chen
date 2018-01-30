package com.guanli.dao;

import com.guanli.pojo.Tgonggao;
import com.guanli.pojo.TgonggaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TgonggaoMapper {
    int countByExample(TgonggaoExample example);

    int deleteByExample(TgonggaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tgonggao record);

    int insertSelective(Tgonggao record);

    List<Tgonggao> selectByExample(TgonggaoExample example);

    Tgonggao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tgonggao record, @Param("example") TgonggaoExample example);

    int updateByExample(@Param("record") Tgonggao record, @Param("example") TgonggaoExample example);

    int updateByPrimaryKeySelective(Tgonggao record);

    int updateByPrimaryKey(Tgonggao record);
    //
    List<Tgonggao> selectAll();
    Tgonggao selectId(Integer id);
}