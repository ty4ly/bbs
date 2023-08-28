package com.ly.bbs.service.impl;

import com.ly.bbs.mapper.CollectMapper;
import com.ly.bbs.pojo.Ban;
import com.ly.bbs.pojo.Collect;
import com.ly.bbs.service.CollectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@Service
public class CollectServiceImpl implements CollectService {

    @Resource
    private CollectMapper collectMapper;

    @Override
    public List<Collect> getAll() {
        return collectMapper.getAll();
    }

    @Override
    public List<Collect> getByUid(int uId) {
        return collectMapper.getByUid(uId);
    }

    @Override
    public Collect getByCid(int cId) {
        return collectMapper.getByCid(cId);
    }

    @Override
    public int getCount(int aId) {
        return collectMapper.getCount(aId);
    }

    @Override
    public int deleteByCid(int cId) {
        return collectMapper.deleteByCid(cId);
    }

    @Override
    public int insert(Collect collect) {
        return collectMapper.insert(collect);
    }
}
