package com.ly.bbs.service.impl;

import com.ly.bbs.mapper.CommentMapper;
import com.ly.bbs.pojo.Comment;
import com.ly.bbs.service.CommentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Resource
    private CommentMapper commentMapper;

    @Override
    public List<Comment> getAll() {
        return commentMapper.getAll();
    }

    @Override
    public List<Comment> getAllAndSecondByAid(int aId) {
        return commentMapper.getAllAndSecondByAid(aId);
    }

    @Override
    public List<Comment> getByUid(int uId) {
        return commentMapper.getByUid(uId);
    }

    @Override
    public List<Comment> getByAid(int aId) {
        return commentMapper.getByAid(aId);
    }

    @Override
    public List<Comment> getSecondComment(int id) {
        return commentMapper.getSecondComment(id);
    }

    @Override
    public int insertComment(Comment comment) {
        return commentMapper.insertComment(comment);
    }

    @Override
    public int deleteCommentByMid(int mId) {
        return commentMapper.deleteCommentByMid(mId);
    }

    @Override
    public int deleteCommentByAid(int aId) {
        return commentMapper.deleteCommentByAid(aId);
    }

    @Override
    public int deleteCommentByUid(int uId) {
        return commentMapper.deleteCommentByUid(uId);
    }
}
