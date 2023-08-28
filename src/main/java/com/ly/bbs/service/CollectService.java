package com.ly.bbs.service;

import com.ly.bbs.pojo.Ban;
import com.ly.bbs.pojo.Collect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.Liu
 */
public interface CollectService {

    List<Collect> getAll();

    List<Collect> getByUid(int uId);

    Collect getByCid(int cId);

    int getCount(int aId); //获取被收藏的数量

    int deleteByCid(int cId);

    int insert(Collect Collect);

    //int deleteByUid();


}
