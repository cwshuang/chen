package com.guanli.pojo;

import java.util.Date;

public class Tbaoming {
    private Integer id;

    private Integer xianluid;

    private String lianxifangshi;

    private String beizhu;

    private Date baomingshi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getXianluid() {
        return xianluid;
    }

    public void setXianluid(Integer xianluid) {
        this.xianluid = xianluid;
    }

    public String getLianxifangshi() {
        return lianxifangshi;
    }

    public void setLianxifangshi(String lianxifangshi) {
        this.lianxifangshi = lianxifangshi == null ? null : lianxifangshi.trim();
    }

    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }

    public Date getBaomingshi() {
        return baomingshi;
    }

    public void setBaomingshi(Date baomingshi) {
        this.baomingshi = baomingshi;
    }
}