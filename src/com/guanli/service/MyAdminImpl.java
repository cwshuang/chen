package com.guanli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guanli.dao.TadminMapper;
import com.guanli.dao.TjingdianMapper;
import com.guanli.dao.TuserMapper;
import com.guanli.pojo.Tadmin;
import com.guanli.pojo.Tuser;

@Service
public class MyAdminImpl implements MyAdmin {
   @Autowired
   private TadminMapper tadminMapper;
	@Override
	public boolean selectAdminLogin(Tadmin tadmin) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if (tadminMapper.selectLoginTadmin(tadmin)!= null) {
			flag=true;
		}
		
		return flag;
	}
	@Override
	public void updatePw(Tadmin tadmin) {
		tadminMapper.updateAdminByUserName(tadmin);
		// TODO Auto-generated method stub
		
	}
	@Autowired
	private TuserMapper tuserMapper;
	@Override
	public List<Tuser> selectTusers() {
		// TODO Auto-generated method stub
		List<Tuser> list = tuserMapper.selectByExample(null);
		return list;
	}
	@Override
	public void deleteUser(Integer userid) {
		// TODO Auto-generated method stub
		tuserMapper.deleteByPrimaryKey(userid);
		
	}
	@Autowired
	private TjingdianMapper tjingdianMapper;
	@Override
	public void deleteJingdian(Integer id) {
		// TODO Auto-generated method stub
		tjingdianMapper.deleteByPrimaryKey(id);
	}
	

}
