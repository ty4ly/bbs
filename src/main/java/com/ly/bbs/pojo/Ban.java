package com.ly.bbs.pojo;

import lombok.Data;

/**
 * @author Mr.Liu
 */
public class Ban {

    private int bId;
    private int uId;
    private String bTime;
    private String bLast;

    private User user;

    public Ban(){}

    public Ban(int bId, int uId, String bTime, String bLast, User user) {
        this.bId = bId;
        this.uId = uId;
        this.bTime = bTime;
        this.bLast = bLast;
        this.user = user;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getbTime() {
        return bTime;
    }

    public void setbTime(String bTime) {
        this.bTime = bTime;
    }

    public String getbLast() {
        return bLast;
    }

    public void setbLast(String bLast) {
        this.bLast = bLast;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Ban{" +
                "bId=" + bId +
                ", uId=" + uId +
                ", bTime='" + bTime + '\'' +
                ", bLast='" + bLast + '\'' +
                ", user=" + user +
                '}';
    }
}
