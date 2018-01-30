package com.guanli.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guanli.dao.TbaomingMapper;
import com.guanli.dao.TgonggaoMapper;
import com.guanli.dao.TjingdianMapper;
import com.guanli.dao.TliuyanMapper;
import com.guanli.dao.TuserMapper;
import com.guanli.dao.TxianluMapper;
import com.guanli.pojo.Tbaoming;
import com.guanli.pojo.Tgonggao;
import com.guanli.pojo.Tjingdian;
import com.guanli.pojo.Tliuyan;
import com.guanli.pojo.Tuser;
import com.guanli.pojo.Txianlu;

@Service
public class MyImpl implements My {

	@Autowired
	private TjingdianMapper tjingdianMapper;
	@Override
	public List<Tjingdian> selectJingDian() {
		// TODO Auto-generated method stub
		List<Tjingdian> selectByExample = tjingdianMapper.selectByExample(null);
          return selectByExample;
	}
	@Override
	public Tjingdian selectJingDianById(Integer id) {
		// TODO Auto-generated method stub
		Tjingdian tjingdian = tjingdianMapper.selectByPrimaryKey(id);
		return tjingdian;
	}
	//*************
	@Autowired
	private TxianluMapper txianluMapper;
	@Override
	public List<Txianlu> selecTxianlu() {
		// TODO Auto-generated method stub
		List<Txianlu> list = txianluMapper.selectByExample(null);
		return list;
	}
	@Override
	public Txianlu selectTxianluById(Integer id) {
		// TODO Auto-generated method stub
		Txianlu xianlu = txianluMapper.selectByPrimaryKey(id);
		return xianlu;
	}
	@Autowired 
	private TuserMapper tuserMapper;
	
	@Override
	public void inserTuser(Tuser tuser) {
		// TODO Auto-generated method stub
		tuserMapper.insertSelective(tuser);

	}
	@Override
	public boolean selectLogin(Tuser tuser) {
		// TODO Auto-generated method stub
		boolean flag=false;
		if (tuserMapper.selectLogin(tuser) != null) {
			flag=true;
		}
		
		return flag;
	}
	@Autowired
	private TbaomingMapper tbaomingMapper;
	@Override
	public void insertTbaoming(Tbaoming tbaoming) {
		// TODO Auto-generated method stub
		tbaomingMapper.insertSelective(tbaoming);
	}
	@Autowired
	private TgonggaoMapper tgonggaoMapper;
	@Override
	public List<Tgonggao> selectTgonggao() {
		// TODO Auto-generated method stub
		//List<Tgonggao> list = tgonggaoMapper.selectByExample(null);
		List<Tgonggao> list = tgonggaoMapper.selectAll();
		return list;
	}
	@Override
	public Tgonggao selectTgonggaoById(Integer id) {
		//Tgonggao gonggao = tgonggaoMapper.selectByPrimaryKey(id);
		Tgonggao gonggao = tgonggaoMapper.selectId(id);
		// TODO Auto-generated method stub
		return gonggao;
	}
	
	@Autowired
	private TliuyanMapper tliuyanMapper;
	@Override
	public List<Tliuyan> selectTliuyan() {
		// TODO Auto-generated method stub
		List<Tliuyan> list = tliuyanMapper.selectByExample(null);
		return list;
	}
	@Override
	public Tliuyan selectTliuyanById(Integer id) {
		// TODO Auto-generated method stub
		Tliuyan liuyan = tliuyanMapper.selectByPrimaryKey(id);
		return liuyan;
	}
	@Override
	public void insertTliuyan(Tliuyan tliuyan) {
		// TODO Auto-generated method stub
		tliuyanMapper.insertliuayn(tliuyan);
		
	}
	@Override
	public Integer selectid(String username) {
		
		// TODO Auto-generated method stub
		return tuserMapper.selectIdByUserName(username);
	}
	@Override
	public Tuser selecTuser(String username) {
		// TODO Auto-generated method stub
		Tuser tuser = tuserMapper.selectTuserByUserName(username);
		return tuser;
	}
	@Override
	public void updateTuser(Tuser tuser) {
		// TODO Auto-generated method stub
		tuserMapper.updateByUserName(tuser);
		
	}
	//报名
	@Override
	public List<Tbaoming> selectTbaoming(String usertel) {
		// TODO Auto-generated method stub
		List<Tbaoming> list = tbaomingMapper.selectTbaomingByUserTel(usertel);
		return list;
	}
	@Override
	public void deleteTbaoming(Integer id) {
		tbaomingMapper.deleteByPrimaryKey(id);
		// TODO Auto-generated method stub
		
	}


}
