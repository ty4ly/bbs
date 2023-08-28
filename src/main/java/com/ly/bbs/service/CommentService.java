package com.ly.bbs.service;

import com.ly.bbs.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.Liu
 */
public interface CommentService {

    List<Comment> getAll();//给子查询用

    List<Comment> getAllAndSecondByAid(int aId);

    List<Comment> getByUid(int uId);

    List<Comment> getByAid(int aId);
    /*根据一级评论id获取所有二级评论*/
    List<Comment> getSecondComment(int id);

    //List<Comment> getByUidAndPrivate(@Param("aId")int aId); 私密评论
    /*插入一条评论*/
    int insertComment(Comment comment);
    /*根据评论id删除评论及其二级评论*/
    int deleteCommentByMid(int mId);
    /*根据帖子id删除下面的所有评论*/
    int deleteCommentByAid(int aId);
    /*根据用户id删除多个评论*/
    int deleteCommentByUid(int uId);

}
