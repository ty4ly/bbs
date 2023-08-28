package com.ly.bbs.mapper;

import com.ly.bbs.pojo.Ban;
import com.ly.bbs.pojo.Collect;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.Liu
 */
public interface CollectMapper {

    List<Collect> getAll();

    List<Collect> getByUid(@Param("uId") int uId);

    Collect getByCid(@Param("cId") int cId);

    int getCount(@Param("aId") int aId); //获取被收藏的数量

    int deleteByCid(@Param("cId") int cId);

    int insert(Collect collect);

    //int deleteByUid();


}
