package com.ly.bbs.pojo;

import lombok.Data;

/**
 * @author Mr.Liu
 */
public class Score {

    private int sId;

    private float sRate;

    private int uId;

    private int aId;

    private String sTime;

    public Score(){}

    public Score(int sId, float sRate, int uId, int aId, String sTime) {
        this.sId = sId;
        this.sRate = sRate;
        this.uId = uId;
        this.aId = aId;
        this.sTime = sTime;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public float getsRate() {
        return sRate;
    }

    public void setsRate(float sRate) {
        this.sRate = sRate;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }

    @Override
    public String toString() {
        return "Score{" +
                "sId=" + sId +
                ", sRate=" + sRate +
                ", uId=" + uId +
                ", aId=" + aId +
                ", sTime='" + sTime + '\'' +
                '}';
    }
}
