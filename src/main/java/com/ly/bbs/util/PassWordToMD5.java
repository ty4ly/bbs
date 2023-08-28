package com.ly.bbs.util;

import com.ly.bbs.util.SendEmail;
import org.apache.shiro.crypto.hash.Md5Hash;

import java.util.UUID;

/**
 * @author Mr.Liu
 */
public class PassWordToMD5 {

        public static String addMd5(String str,String salt){

                return  new  Md5Hash(str,salt).toString();
        }

        public static void main(String[] args) {
//                UUID uuid = UUID.randomUUID();
//                System.out.println(uuid.toString());
                //System.out.println(addMd5("123", "abcd"));

               String name="张三";
                byte[] bytes = name.getBytes();
                String s = bytes.toString();
                System.out.println(s);
                String name1 = new String(bytes);
                String name2 = new String(s.getBytes());
                System.out.println(name1);
                System.out.println("-----------");
                System.out.println(name2);

            SendEmail sendEmail = new SendEmail();
            sendEmail.send("2404648633@qq.com");
            //sendEmail.send("1521609461@qq.com");

        }

}
