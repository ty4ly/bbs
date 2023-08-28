package com.ly.bbs.service.impl;

import com.ly.bbs.mapper.ArticleMapper;
import com.ly.bbs.pojo.Article;
import com.ly.bbs.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private ArticleMapper articleMapper;

    @Override
    public Article getArticleAndUserById(int aId) {
        return articleMapper.getArticleAndUserById(aId);
    }

    @Override
    public List<Article> getAll() {

        return articleMapper.getAll();
    }

    @Override
    public List<Article> getArticlesByState(int state) {
        return articleMapper.getArticlesByState(state);
    }

    @Override
    public int deleteById(int aId, int uId) {
        return articleMapper.deleteById(aId,uId);
    }

    @Override
    public int deleteByIdForever(int aId) {
        return articleMapper.deleteByIdForever(aId);
    }

    @Override
    public int updateArticle(Article article) {
        return articleMapper.updateArticle(article);
    }

    @Override
    public int addArticle(Article article) {
        return articleMapper.addArticle(article);
    }

    @Override
    public List<Article> getBytid(int tId) {
        return articleMapper.getBytid(tId);
    }

    @Override
    public List<Article> getByaidandstate(int uId, int aState) {
        return articleMapper.getByaidandstate(uId,aState);
    }

    @Override
    public List<Article> getByUid(int uid) {
        return articleMapper.getByUid(uid);
    }
}
