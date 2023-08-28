package com.ly.bbs.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Mr.Liu
 */
public class DateFormat {


    public static void main(String[] args) {
        System.out.println(formatDate());
    }

        public static String formatDate(){
            SimpleDateFormat smt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return smt.format(new Date()).toString();
        }

        public static String formatDateShort(){
            SimpleDateFormat smt = new SimpleDateFormat("yyyy-MM-dd");
            return smt.format(new Date()).toString();
        }


        public static String formatDate(long stamp){
            SimpleDateFormat smt = new SimpleDateFormat("yyyy-MM-dd");

            return smt.format(new Date(stamp)).toString();
        }

        public static String formatDate(String schemaString){
            SimpleDateFormat smt = new SimpleDateFormat(schemaString);

            return smt.format(new Date()).toString();
        }

}
