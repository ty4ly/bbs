package com.ly.bbs.util;

import java.util.Random;

/**
 * @author Mr.Liu
 */
public class StaticUtil {

    public static final String LOCAL_IMAGE_PATH = "F:/aImgLocation/";


    /**
     * 获取随机字符串
     *
     * @param num
     * @return
     */
    public static String getRandomString(Integer num) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }


}
