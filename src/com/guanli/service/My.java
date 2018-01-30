package com.guanli.service;

import java.util.List;

import com.guanli.pojo.Tbaoming;
import com.guanli.pojo.Tgonggao;
import com.guanli.pojo.Tjingdian;
import com.guanli.pojo.Tliuyan;
import com.guanli.pojo.Tuser;
import com.guanli.pojo.Txianlu;

public interface My {

	public List<Tjingdian> selectJingDian();
	public Tjingdian selectJingDianById(Integer id);
	
	//
	public List<Txianlu> selecTxianlu();
	public Txianlu selectTxianluById(Integer id);
	
	//注册
	public void inserTuser(Tuser tuser);
	//登录
	public boolean selectLogin(Tuser tuser);
	//报名
	public void insertTbaoming(Tbaoming tbaoming);
	//公告
	public List<Tgonggao> selectTgonggao();
	public Tgonggao selectTgonggaoById(Integer id);
	//留言
	public List<Tliuyan> selectTliuyan();
	public Tliuyan selectTliuyanById(Integer id);
	public void insertTliuyan(Tliuyan tliuyan);
	
	//通过用户名查id
	public Integer selectid(String username);
	
	//个人信息
	public Tuser selecTuser(String username);
	
	public void updateTuser(Tuser tuser);
	
	//报名信息
	public List<Tbaoming> selectTbaoming(String usertel);
	
	//取消报名
	public void deleteTbaoming(Integer id);
}
