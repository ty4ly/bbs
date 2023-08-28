package com.ly.bbs.pojo;

import lombok.Data;

/**
 * @author Mr.Liu
 */
public class Article {

    private int aId;

    private int uId;

    private String aTime;

    private String aTittle;

    private String aContent;

    private int tId;

    private int aState;

    private int uIdForAdmin;


    /*对应的操作人的uId*/
    private User userForAdmin;

    /*存放对应的user信息 表里没有对应的字段*/
    private User user;

    /*对应的type对象信息*/
    private Type type;

    public Article(){}

    public Article(int aId, int uId, String aTime, String aTittle, String aContent, int tId, int aState, int uIdForAdmin, User userForAdmin, User user, Type type) {
        this.aId = aId;
        this.uId = uId;
        this.aTime = aTime;
        this.aTittle = aTittle;
        this.aContent = aContent;
        this.tId = tId;
        this.aState = aState;
        this.uIdForAdmin = uIdForAdmin;
        this.userForAdmin = userForAdmin;
        this.user = user;
        this.type = type;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getaTime() {
        return aTime;
    }

    public void setaTime(String aTime) {
        this.aTime = aTime;
    }

    public String getaTittle() {
        return aTittle;
    }

    public void setaTittle(String aTittle) {
        this.aTittle = aTittle;
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public int getaState() {
        return aState;
    }

    public void setaState(int aState) {
        this.aState = aState;
    }

    public int getuIdForAdmin() {
        return uIdForAdmin;
    }

    public void setuIdForAdmin(int uIdForAdmin) {
        this.uIdForAdmin = uIdForAdmin;
    }

    public User getUserForAdmin() {
        return userForAdmin;
    }

    public void setUserForAdmin(User userForAdmin) {
        this.userForAdmin = userForAdmin;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Article{" +
                "aId=" + aId +
                ", uId=" + uId +
                ", aTime='" + aTime + '\'' +
                ", aTittle='" + aTittle + '\'' +
                ", aContent='" + aContent + '\'' +
                ", tId=" + tId +
                ", aState=" + aState +
                ", uIdForAdmin=" + uIdForAdmin +
                ", userForAdmin=" + userForAdmin +
                ", user=" + user +
                ", type=" + type +
                '}';
    }
}
