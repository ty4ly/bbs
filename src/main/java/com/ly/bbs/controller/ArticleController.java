package com.ly.bbs.controller;

import com.ly.bbs.util.JsonResult;
import com.ly.bbs.util.UploadImg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author Mr.Liu
 */
@RestController
@RequestMapping("/article")
@Slf4j
public class ArticleController {

    private String path;

    @PostMapping("/upload")
    public JsonResult<Map<String, String>> uploadImg(MultipartFile file) throws Exception {

        final String uploads = UploadImg.uploads(file);

        Map<String,String> map = new HashMap<>();

        JsonResult<Map<String,String>> result = new JsonResult<Map<String, String>>(200,map);

        map.put("url",uploads);

        result.setData(map);
        System.out.println(result+"-----");
        return result;
    }

}
