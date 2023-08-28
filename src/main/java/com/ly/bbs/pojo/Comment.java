package com.ly.bbs.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author Mr.Liu
 */
public class Comment {

    private int mId;

    private int uId;

    private int aId;

    private int mCommentedId;

    private String mContent;

    private String mTime;
    /*是否私密评论 0 public  1 private  local storage 获取uId v-if*/
    private int mType;

    private List<Comment> comments;

    /*只需要用户的id和昵称头像*/
    private User user;

    public Comment(){}

    public Comment(int mId, int uId, int aId, int mCommentedId, String mContent, String mTime, int mType, List<Comment> comments, User user) {
        this.mId = mId;
        this.uId = uId;
        this.aId = aId;
        this.mCommentedId = mCommentedId;
        this.mContent = mContent;
        this.mTime = mTime;
        this.mType = mType;
        this.comments = comments;
        this.user = user;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
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

    public int getmCommentedId() {
        return mCommentedId;
    }

    public void setmCommentedId(int mCommentedId) {
        this.mCommentedId = mCommentedId;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public int getmType() {
        return mType;
    }

    public void setmType(int mType) {
        this.mType = mType;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "mId=" + mId +
                ", uId=" + uId +
                ", aId=" + aId +
                ", mCommentedId=" + mCommentedId +
                ", mContent='" + mContent + '\'' +
                ", mTime='" + mTime + '\'' +
                ", mType=" + mType +
                ", comments=" + comments +
                ", user=" + user +
                '}';
    }
}
