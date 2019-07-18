package com.longchenyu.community.model;

public class User {
    private Integer id;
    private String account_id;
    private String name;
    private String token;
    private Long gmt_creat;
    private Long gmt_modified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountId() {
        return account_id;
    }

    public void setAccountId(String accountId) {
        this.account_id = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getGmtCreat() {
        return gmt_creat;
    }

    public void setGmtCreat(Long gmtCreat) {
        this.gmt_creat = gmtCreat;
    }

    public Long getGmtModified() {
        return gmt_modified;
    }

    public void setGmtModified(Long gmtModified) {
        this.gmt_modified = gmtModified;
    }
}
