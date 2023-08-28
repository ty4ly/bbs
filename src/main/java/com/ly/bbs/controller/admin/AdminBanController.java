package com.ly.bbs.controller.admin;

import com.ly.bbs.pojo.Ban;
import com.ly.bbs.service.BanService;
import com.ly.bbs.util.JsonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@RestController
@RequestMapping("/a_ban")
public class AdminBanController {

    @Resource
    private BanService banServiceImpl;


    @GetMapping("/getAll")
    public JsonResult<List<Ban>> getAll(){



        return new JsonResult<List<Ban>>(200,banServiceImpl.getBanAndUser2());
    }

}
