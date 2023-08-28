package com.ly.bbs.mapper;

import com.ly.bbs.pojo.Follow;
import com.ly.bbs.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.Liu
 */

public interface FollowMapper {

        List<Follow> getAll();
        /*获取包括关注列表*/
        List<Follow> getByUid(@Param("uId") int uId);

        /*只获取uId 和其对应的关注列表 distinkt 去重 单词忘了怎么写了 或者用子查询*/
        List<User> getByUid2(@Param("uId") int uId);
        /*获取所有谁关注了我的列表*/
        List<User> getByUided(@Param("uIded")int uIded);

        Follow getByFid(@Param("fId") int fId);

        @SuppressWarnings("all")
        int getFansCount(@Param("id") int uIded);

        int insertFollow(Follow follow);

        /*传入uid 和uided 取关*/
        int deleteFollowByUidedAndUid(Follow follow);

}
