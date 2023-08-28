package com.ly.bbs.service;

import com.ly.bbs.pojo.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.Liu
 */
public interface TypeService {

    List<Type> getAll();

    Type getByTid(@Param("tId") int tId);

    Type getBytName(@Param("tName") String tName);

    int addType(Type type);

    int deleteType(@Param("tId")int tId);
}
