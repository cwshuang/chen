package com.guanli.service;

import java.util.List;

import com.guanli.pojo.Tadmin;
import com.guanli.pojo.Tuser;

public interface MyAdmin {

	public boolean selectAdminLogin(Tadmin tadmin);
	
	public void updatePw(Tadmin tadmin);
	
	//查询所有用户
	public List<Tuser> selectTusers();
	
	//删除用户 
	public void deleteUser(Integer userId);
	//删除景点
	public void deleteJingdian(Integer id);
	

	
}
