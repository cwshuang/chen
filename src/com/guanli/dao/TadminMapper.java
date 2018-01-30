package com.guanli.dao;

import com.guanli.pojo.Tadmin;
import com.guanli.pojo.TadminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TadminMapper {
    int countByExample(TadminExample example);

    int deleteByExample(TadminExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Tadmin record);

    int insertSelective(Tadmin record);

    List<Tadmin> selectByExample(TadminExample example);

    Tadmin selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Tadmin record, @Param("example") TadminExample example);

    int updateByExample(@Param("record") Tadmin record, @Param("example") TadminExample example);

    int updateByPrimaryKeySelective(Tadmin record);

    int updateByPrimaryKey(Tadmin record);
    
    Tadmin selectLoginTadmin(Tadmin tadmin);
    int updateAdminByUserName(Tadmin tadmin);
}