package com.ly.bbs.controller.admin;

import com.ly.bbs.pojo.Type;
import com.ly.bbs.service.TypeService;
import com.ly.bbs.util.JsonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@RestController
@RequestMapping("/a_type")
public class AdminTypeController {

    @Resource
    private TypeService typeServiceImpl;

    @GetMapping("/getAll")
    public JsonResult<List<Type>> getAll(){

        List<Type> all = typeServiceImpl.getAll();

        JsonResult<List<Type>> res = new JsonResult<>(200,all);

        return res;
    }
    @PostMapping("/add")
    public int addType(@RequestBody Type type){
        System.out.println(type);
        int i = typeServiceImpl.addType(type);
        int id = typeServiceImpl.getBytName(type.gettName()).gettId();
        System.out.println(i+"-----type"+id);
        return id;
        //return 0;
    }

    /*应当删除该分类下的所有文章*/
    @GetMapping("/del/{id}")
    public int deleteType(@PathVariable("id")int id){



        return typeServiceImpl.deleteType(id);
    }

}
