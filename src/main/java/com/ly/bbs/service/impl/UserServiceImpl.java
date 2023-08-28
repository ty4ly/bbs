package com.ly.bbs.service.impl;

import com.ly.bbs.mapper.UserMapper;
import com.ly.bbs.pojo.Article;
import com.ly.bbs.pojo.User;
import com.ly.bbs.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User getById(int uId) {
        return userMapper.getById(uId);
    }

    @Override
    public User getByUserName(String userName) {
        return userMapper.getByUserName(userName);
    }

    @Override
    public List<Article> getArticlesById(int uId) {
        return userMapper.getArticlesById(uId);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }

    @Override
    public int changeState(int uId) {
        return userMapper.changeState(uId);
    }

    @Override
    public User getUserAndArticlesByUid(int uId) {
        return userMapper.getUserAndArticlesByUid(uId);
    }

    @Override
    public int unBan(int uId) {
        return userMapper.unBan(uId);
    }

    @Override
    public User adminLogin(User user) {
        return userMapper.adminLogin(user);
    }
}
