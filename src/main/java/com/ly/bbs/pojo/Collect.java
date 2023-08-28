package com.ly.bbs.pojo;

/**
 * @author Mr.Liu
 */
public class Collect {

    private int cId;

    private int uId;

    private int aId;

    private String cTime;

    public Collect(){}

    public Collect(int cId, int uId, int aId, String cTime) {
        this.cId = cId;
        this.uId = uId;
        this.aId = aId;
        this.cTime = cTime;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
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

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "cId=" + cId +
                ", uId=" + uId +
                ", aId=" + aId +
                ", cTime='" + cTime + '\'' +
                '}';
    }
}
