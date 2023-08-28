package com.ly.bbs.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author Mr.Liu
 */
@SuppressWarnings("all")
public class User {

        private int uId;
        private int uNumber;
        private String uPassWord;
        private String uNickName;
        private String uImageUrl;
        /*角色 0 1 2*/
        private int uRole;
        /*性别 0 1*/
        private int uGender;
        private String uEmail;
        private String uAddress;
        /*账号状态 0 1*/
        private int uState;
        private String uRegistTime;
        /*积分*/
        private int uIntegral;

        private List<Article> articles;

        public User(){}

        public User(int uId, int uNumber, String uPassWord, String uNickName, String uImageUrl, int uRole, int uGender, String uEmail, String uAddress, int uState, String uRegistTime, int uIntegral, List<Article> articles) {
                this.uId = uId;
                this.uNumber = uNumber;
                this.uPassWord = uPassWord;
                this.uNickName = uNickName;
                this.uImageUrl = uImageUrl;
                this.uRole = uRole;
                this.uGender = uGender;
                this.uEmail = uEmail;
                this.uAddress = uAddress;
                this.uState = uState;
                this.uRegistTime = uRegistTime;
                this.uIntegral = uIntegral;
                this.articles = articles;
        }

        public int getuId() {
                return uId;
        }

        public void setuId(int uId) {
                this.uId = uId;
        }

        public int getuNumber() {
                return uNumber;
        }

        public void setuNumber(int uNumber) {
                this.uNumber = uNumber;
        }

        public String getuPassWord() {
                return uPassWord;
        }

        public void setuPassWord(String uPassWord) {
                this.uPassWord = uPassWord;
        }

        public String getuNickName() {
                return uNickName;
        }

        public void setuNickName(String uNickName) {
                this.uNickName = uNickName;
        }

        public String getuImageUrl() {
                return uImageUrl;
        }

        public void setuImageUrl(String uImageUrl) {
                this.uImageUrl = uImageUrl;
        }

        public int getuRole() {
                return uRole;
        }

        public void setuRole(int uRole) {
                this.uRole = uRole;
        }

        public int getuGender() {
                return uGender;
        }

        public void setuGender(int uGender) {
                this.uGender = uGender;
        }

        public String getuEmail() {
                return uEmail;
        }

        public void setuEmail(String uEmail) {
                this.uEmail = uEmail;
        }

        public String getuAddress() {
                return uAddress;
        }

        public void setuAddress(String uAddress) {
                this.uAddress = uAddress;
        }

        public int getuState() {
                return uState;
        }

        public void setuState(int uState) {
                this.uState = uState;
        }

        public String getuRegistTime() {
                return uRegistTime;
        }

        public void setuRegistTime(String uRegistTime) {
                this.uRegistTime = uRegistTime;
        }

        public int getuIntegral() {
                return uIntegral;
        }

        public void setuIntegral(int uIntegral) {
                this.uIntegral = uIntegral;
        }

        public List<Article> getArticles() {
                return articles;
        }

        public void setArticles(List<Article> articles) {
                this.articles = articles;
        }

        @Override
        public String toString() {
                return "User{" +
                        "uId=" + uId +
                        ", uNumber=" + uNumber +
                        ", uPassWord='" + uPassWord + '\'' +
                        ", uNickName='" + uNickName + '\'' +
                        ", uImageUrl='" + uImageUrl + '\'' +
                        ", uRole=" + uRole +
                        ", uGender=" + uGender +
                        ", uEmail='" + uEmail + '\'' +
                        ", uAddress='" + uAddress + '\'' +
                        ", uState=" + uState +
                        ", uRegistTime='" + uRegistTime + '\'' +
                        ", uIntegral=" + uIntegral +
                        ", articles=" + articles +
                        '}';
        }
}