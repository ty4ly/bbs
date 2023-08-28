package com.ly.bbs.mapper;

import com.ly.bbs.pojo.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.Liu
 * 二级评论无更深的评论故不需考虑其aId 和type 默认是随着一级评论是否展示
 */
public interface CommentMapper {

        List<Comment> getAll();//给子查询用

        List<Comment> getAllAndSecondByAid(@Param("aId") int aId);

        List<Comment> getByUid(@Param("uId")int uId);

        List<Comment> getByAid(@Param("aId")int aId);
        /*根据一级评论id获取所有二级评论*/
        List<Comment> getSecondComment(@Param("id") int id);

        //List<Comment> getByUidAndPrivate(@Param("aId")int aId); 私密评论
        /*插入一条评论*/
        int insertComment(Comment comment);
        /*根据评论id删除评论及其二级评论*/
        int deleteCommentByMid(@Param("mId") int mId);
        /*根据帖子id删除下面的所有评论*/
        int deleteCommentByAid(@Param("aId") int aId);
        /*根据用户id删除多个评论*/
        int deleteCommentByUid(@Param("uId")int uId);


}


