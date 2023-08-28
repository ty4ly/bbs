package com.ly.bbs.service.impl;

import com.ly.bbs.mapper.ScoreMapper;
import com.ly.bbs.pojo.Score;
import com.ly.bbs.service.ScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@Service
public class ScoreServiceImpl implements ScoreService {

    @Resource
    private ScoreMapper scoreMapper;

    @Override
    public List<Score> getAll() {
        return scoreMapper.getAll();
    }

    @Override
    public Score getBySid(int sId) {
        return scoreMapper.getBySid(sId);
    }

    @Override
    public Score getByUidAndAid(Score score) {
        return scoreMapper.getByUidAndAid(score);
    }

    @Override
    public List<Score> getByUid(int uId) {
        return scoreMapper.getByUid(uId);
    }

    @Override
    public List<Score> getByAid(int aId) {
        return scoreMapper.getByAid(aId);
    }

    @Override
    public int insertScore(Score score) {
        return scoreMapper.insertScore(score);
    }
}
