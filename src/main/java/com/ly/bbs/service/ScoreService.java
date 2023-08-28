package com.ly.bbs.service;

import com.ly.bbs.pojo.Score;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.Liu
 */
public interface ScoreService {

    List<Score> getAll();

    Score getBySid(@Param("sId")int sId);
    /*获取一条评分 点开一条帖子详情的时候可以结合local storage 的userId 来获得当前帖子的评分*/
    Score getByUidAndAid(Score score);

    /*获取被评分的数据*/
    List<Score> getByUid(@Param("uId") int uId);

    /*获取被评分的数据*/
    List<Score> getByAid(@Param("aId") int aId);

    int insertScore(Score score);

    //int deleteScore(int sId);  //暂时不能取消评分

}
