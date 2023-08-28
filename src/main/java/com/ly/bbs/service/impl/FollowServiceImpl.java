package com.ly.bbs.service.impl;

import com.ly.bbs.mapper.FollowMapper;
import com.ly.bbs.pojo.Follow;
import com.ly.bbs.pojo.User;
import com.ly.bbs.service.FollowService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@Service
public class FollowServiceImpl implements FollowService {

    @Resource
    private FollowMapper followMapper;

    @Override
    public List<Follow> getAll() {
        return followMapper.getAll();
    }

    @Override
    public List<Follow> getByUid(int uId) {
        return followMapper.getByUid(uId);
    }

    @Override
    public List<User> getByUid2(int uId) {
        return followMapper.getByUid2(uId);
    }

    @Override
    public List<User> getByUided(int uIded) {
        return followMapper.getByUided(uIded);
    }

    @Override
    public Follow getByFid(int fId) {
        return followMapper.getByFid(fId);
    }

    @Override
    public int getFansCount(int uIded) {
        return followMapper.getFansCount(uIded);
    }

    @Override
    public int insertFollow(Follow follow) {
        return followMapper.insertFollow(follow);
    }

    @Override
    public int deleteFollowByUidedAndUid(Follow follow) {
        return followMapper.deleteFollowByUidedAndUid(follow);
    }
}
