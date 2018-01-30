package com.guanli.pojo;

import java.util.Date;

public class Tliuyan {
    private Integer id;

    private String neirong;

    private Date liuyanshi;

    private Integer userid;

    private String huifu;

    private Date huifushi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong == null ? null : neirong.trim();
    }

    public Date getLiuyanshi() {
        return liuyanshi;
    }

    public void setLiuyanshi(Date liuyanshi) {
        this.liuyanshi = liuyanshi;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getHuifu() {
        return huifu;
    }

    public void setHuifu(String huifu) {
        this.huifu = huifu == null ? null : huifu.trim();
    }

    public Date getHuifushi() {
        return huifushi;
    }

    public void setHuifushi(Date huifushi) {
        this.huifushi = huifushi;
    }
}