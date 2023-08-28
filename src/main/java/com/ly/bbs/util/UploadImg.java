package com.ly.bbs.util;

import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author Mr.Liu
 */
public class UploadImg {



    public static String uploads(MultipartFile file) throws Exception{

        //原始文件名
        String originalFilename = file.getOriginalFilename();//abc.jpg
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));

        //使用UUID重新生成文件名，防止文件名称重复造成文件覆盖
        String fileName = UUID.randomUUID().toString().substring(1,10) + suffix;//dfsdfdfd.jpg

        //创建一个目录对象
        File dir = new File(StaticUtil.LOCAL_IMAGE_PATH);
        //判断当前目录是否存在
        if(!dir.exists()){
            //目录不存在，需要创建
            dir.mkdirs();
        }

        try {
            //将临时文件转存到指定位置
            file.transferTo(new File(StaticUtil.LOCAL_IMAGE_PATH + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }



        return "http://localhost:8080/bbs/upload/"+fileName;

    }


}
