package com.guanli.pojo;

import java.util.List;

public class QueryVo {
	
private List<Tjingdian> jingdianList;
private Tjingdian jiandian;
//
private List<Txianlu> xianluList;
private Txianlu xianlu;

//公告
private List<Tgonggao> gonggaoList;
private Tgonggao gonggao1;
//留言
private Tliuyan liuyan;

//留言
private List<Tliuyan> liuyanList;
public List<Tjingdian> getJingdianList() {
	return jingdianList;
}
//修改个人信息
private Tuser user1;

//报名信息
private List<Tbaoming> baomingList;

public void setJingdianList(List<Tjingdian> jingdianList) {
	this.jingdianList = jingdianList;
}

public Tjingdian getJiandian() {
	return jiandian;
}

public void setJiandian(Tjingdian jiandian) {
	this.jiandian = jiandian;
}

public List<Txianlu> getXianluList() {
	return xianluList;
}

public void setXianluList(List<Txianlu> xianluList) {
	this.xianluList = xianluList;
}

public Txianlu getXianlu() {
	return xianlu;
}

public void setXianlu(Txianlu xianlu) {
	this.xianlu = xianlu;
}

public List<Tgonggao> getGonggaoList() {
	return gonggaoList;
}

public void setGonggaoList(List<Tgonggao> gonggaoList) {
	this.gonggaoList = gonggaoList;
}

public List<Tliuyan> getLiuyanList() {
	return liuyanList;
}

public void setLiuyanList(List<Tliuyan> liuyanList) {
	this.liuyanList = liuyanList;
}

public Tliuyan getLiuyan() {
	return liuyan;
}

public void setLiuyan(Tliuyan liuyan) {
	this.liuyan = liuyan;
}


public Tgonggao getGonggao1() {
	return gonggao1;
}

public void setGonggao1(Tgonggao gonggao1) {
	this.gonggao1 = gonggao1;
}


public Tuser getUser1() {
	return user1;
}

public void setUser1(Tuser user1) {
	this.user1 = user1;
}

public List<Tbaoming> getBaomingList() {
	return baomingList;
}

public void setBaomingList(List<Tbaoming> baomingList) {
	this.baomingList = baomingList;
}



}
