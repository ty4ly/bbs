package com.ly.bbs.pojo;

import lombok.Data;

import java.util.List;


/**
 * @author Mr.Liu
 */
@SuppressWarnings("all")
public class Follow {

    private int fId;

    private int uId;

    private int uIded;

    private String fTime;

    private User usered;

    public Follow(){}

    public Follow(int fId, int uId, int uIded, String fTime, User usered) {
        this.fId = fId;
        this.uId = uId;
        this.uIded = uIded;
        this.fTime = fTime;
        this.usered = usered;
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getuIded() {
        return uIded;
    }

    public void setuIded(int uIded) {
        this.uIded = uIded;
    }

    public String getfTime() {
        return fTime;
    }

    public void setfTime(String fTime) {
        this.fTime = fTime;
    }

    public User getUsered() {
        return usered;
    }

    public void setUsered(User usered) {
        this.usered = usered;
    }

    @Override
    public String toString() {
        return "Follow{" +
                "fId=" + fId +
                ", uId=" + uId +
                ", uIded=" + uIded +
                ", fTime='" + fTime + '\'' +
                ", usered=" + usered +
                '}';
    }
}
