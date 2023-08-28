package com.ly.bbs.controller.admin;

import com.ly.bbs.pojo.Article;
import com.ly.bbs.service.ArticleService;
import com.ly.bbs.util.JsonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@RestController
@RequestMapping("/a_article")
public class AdminArticleController {

    @Resource
    private ArticleService articleServiceImpl;

    @PostMapping("/getAll")
    public JsonResult<List<Article>> getAll(){

        List<Article> all = articleServiceImpl.getAll();

        System.out.println(all);

        int code = 500;
        if(all!=null){
            code = 200;
        }

        JsonResult<List<Article>> result = new JsonResult<>(code,all);

        result.setMessage("成功");

        return result;
    }
    @PostMapping("/update")
    public int updateArticle(@RequestBody Article article){
        System.out.println(article);

        articleServiceImpl.updateArticle(article);

        return 200;

    }
    @PostMapping("/lock/{state}/{id}")
    public int lockArticle(@PathVariable("state") int state,@PathVariable("id") int id){

        System.out.println(state);

        Article article = new Article();
        article.setaId(id);
        article.setaState(state);
        articleServiceImpl.updateArticle(article);

        return 200;
    }



}
