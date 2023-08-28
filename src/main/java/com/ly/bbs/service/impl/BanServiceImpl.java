package com.ly.bbs.service.impl;

import com.ly.bbs.mapper.BanMapper;
import com.ly.bbs.pojo.Ban;
import com.ly.bbs.service.BanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@Service
public class BanServiceImpl implements BanService {

    @Resource
    private BanMapper banMapper;

    @Override
    public Ban getByBid(int bId) {
        return banMapper.getByBid(bId);
    }

    @Override
    public List<Ban> getAll() {
        return banMapper.getAll();
    }

    @Override
    public Ban getByUidLastOne(int uId) {
        return banMapper.getByUidLastOne(uId);
    }

    @Override
    public List<Ban> getAllByUid(int uId) {
        return banMapper.getAllByUid(uId);
    }

    @Override
    public int delByBid(int bId) {
        return banMapper.delByBid(bId);
    }

    @Override
    public int updateBan(Ban ban) {
        return banMapper.updateBan(ban);
    }

    @Override
    public int insertBan(Ban ban) {
        return banMapper.insertBan(ban);
    }

    @Override
    public Ban getBanAndUser(int uId) {
        return banMapper.getBanAndUser(uId);
    }

    @Override
    public List<Ban> getBanAndUser2() {
        return banMapper.getBanAndUser2();
    }
}
