package com.guanli.dao;

import com.guanli.pojo.Tuser;
import com.guanli.pojo.TuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TuserMapper {
    int countByExample(TuserExample example);

    int deleteByExample(TuserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Tuser record);

    int insertSelective(Tuser record);

    public Tuser selectLogin(Tuser record);
    List<Tuser> selectByExample(TuserExample example);

    Tuser selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Tuser record, @Param("example") TuserExample example);

    int updateByExample(@Param("record") Tuser record, @Param("example") TuserExample example);

    int updateByPrimaryKeySelective(Tuser record);

    int updateByPrimaryKey(Tuser record);
    
    int selectIdByUserName(String username);
    
    Tuser selectTuserByUserName(String username);
    int updateByUserName(Tuser record);
    List<TbaomingMapper> selectTbaomingByUserName(String username);
}