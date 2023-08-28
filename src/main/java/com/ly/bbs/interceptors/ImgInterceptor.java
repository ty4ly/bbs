package com.ly.bbs.interceptors;

import com.ly.bbs.util.StaticUtil;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Mr.Liu
 */
@Configuration
public class ImgInterceptor implements WebMvcConfigurer {


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        /**
         * 图片资源文件映射配置
         */
        String os = System.getProperty("os.name");
        System.out.println(os+"---------");//Windows 7
        if (os.substring(0,5).toLowerCase().startsWith("win")) {  //如果是Windows系统
            System.out.println(os+"---------");
            registry.addResourceHandler("/upload/**").addResourceLocations("file:"+ StaticUtil.LOCAL_IMAGE_PATH);
        }

    }



}
