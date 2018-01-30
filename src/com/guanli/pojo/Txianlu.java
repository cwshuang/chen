package com.guanli.pojo;

import java.util.Date;

public class Txianlu {
    private Integer id;

    private String xianlumincheng;

    private String fatuandidian;

    private Date fatuanshiian;

    private String xianlujiage;

    private String lianxidianhua;

    private String lianxiren;

    private Date fabushijian;

    private String del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getXianlumincheng() {
        return xianlumincheng;
    }

    public void setXianlumincheng(String xianlumincheng) {
        this.xianlumincheng = xianlumincheng == null ? null : xianlumincheng.trim();
    }

    public String getFatuandidian() {
        return fatuandidian;
    }

    public void setFatuandidian(String fatuandidian) {
        this.fatuandidian = fatuandidian == null ? null : fatuandidian.trim();
    }

    public Date getFatuanshiian() {
        return fatuanshiian;
    }

    public void setFatuanshiian(Date fatuanshiian) {
        this.fatuanshiian = fatuanshiian;
    }

    public String getXianlujiage() {
        return xianlujiage;
    }

    public void setXianlujiage(String xianlujiage) {
        this.xianlujiage = xianlujiage == null ? null : xianlujiage.trim();
    }

    public String getLianxidianhua() {
        return lianxidianhua;
    }

    public void setLianxidianhua(String lianxidianhua) {
        this.lianxidianhua = lianxidianhua == null ? null : lianxidianhua.trim();
    }

    public String getLianxiren() {
        return lianxiren;
    }

    public void setLianxiren(String lianxiren) {
        this.lianxiren = lianxiren == null ? null : lianxiren.trim();
    }

    public Date getFabushijian() {
        return fabushijian;
    }

    public void setFabushijian(Date fabushijian) {
        this.fabushijian = fabushijian;
    }

    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del == null ? null : del.trim();
    }
}