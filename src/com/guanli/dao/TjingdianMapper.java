package com.guanli.dao;

import com.guanli.pojo.Tjingdian;
import com.guanli.pojo.TjingdianExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TjingdianMapper {
    int countByExample(TjingdianExample example);

    int deleteByExample(TjingdianExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Tjingdian record);

    int insertSelective(Tjingdian record);

    List<Tjingdian> selectByExample(TjingdianExample example);

    Tjingdian selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Tjingdian record, @Param("example") TjingdianExample example);

    int updateByExample(@Param("record") Tjingdian record, @Param("example") TjingdianExample example);

    int updateByPrimaryKeySelective(Tjingdian record);

    int updateByPrimaryKey(Tjingdian record);
}