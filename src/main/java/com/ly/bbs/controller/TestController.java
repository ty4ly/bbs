package com.ly.bbs.controller;

import com.ly.bbs.mapper.ArticleMapper;
import com.ly.bbs.mapper.UserMapper;
import com.ly.bbs.pojo.Article;
import com.ly.bbs.pojo.User;
import com.ly.bbs.util.DateFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author Mr.Liu
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private UserMapper userMapper;

    @GetMapping("/user")
    public User getByid(){
        return userMapper.getUserAndArticlesByUid(1);
    }

    @GetMapping("/getAll")
    public List<User> getUsers(){
        return userMapper.getAll();
    }


    @GetMapping("/id/{id}")
    public Article getAll(@PathVariable("id")int id){

        return articleMapper.getArticleAndUserById(id);

    }

    @GetMapping("/ins")
    public int testIns(Article article){



        return 0;
    }


    @GetMapping("/del")
    public int testdel(Article article){

        articleMapper.deleteById(2,1);

        return 0;
    }

    @GetMapping("/delf")
    public int testdelf(Article article){




        articleMapper.deleteByIdForever(2);

        return 0;
    }


    @GetMapping("/all")
    public List<Article> all(Article article){


        System.out.println(articleMapper.getByUid(1));


        return  articleMapper.getByUid(1);
    }


}
