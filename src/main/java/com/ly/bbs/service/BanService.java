package com.ly.bbs.service;

import com.ly.bbs.pojo.Ban;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.Liu
 */
public interface BanService {

    Ban getByBid(int bId);

    List<Ban> getAll();

    Ban getByUidLastOne(int uId); //根据uid查询最后一次封号记录如果以超期则解封 登陆时判断

    List<Ban> getAllByUid(int uId); //获取指定用户的所有记录

    int delByBid(int bId); //根据bid删除一条记录

    int updateBan(Ban ban); //根据传入的对象更新一条记录

    int insertBan(Ban ban); //插入一条记录 各项不能为空 第二个时间为持续时间或者结束时间

    Ban getBanAndUser(int uId);

    List<Ban> getBanAndUser2();

}
