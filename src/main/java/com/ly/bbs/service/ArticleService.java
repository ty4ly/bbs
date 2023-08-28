package com.ly.bbs.service;

import com.ly.bbs.pojo.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.Liu
 */
public interface ArticleService {

    Article getArticleAndUserById(int aId); //帖子详细信息

    List<Article> getAll(); //所有


    List<Article> getArticlesByState(int state); //是否逻辑删除

    int deleteById(int aId,int uId); //逻辑删除 操作对象是自己 update state 为1  0为正常

    int deleteByIdForever(int aId); //从回收站移除

    int updateArticle(Article article); //更新

    int addArticle(Article article); //插入

    List<Article> getBytid(int tId); //根据类型查找

    List<Article> getByaidandstate(int uId,int aState); //根据用户id 和 帖子状态查找

    List<Article> getByUid(int uid);

}
