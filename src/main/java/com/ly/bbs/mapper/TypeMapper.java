package com.ly.bbs.mapper;

import com.ly.bbs.pojo.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Mr.Liu
 */
public interface TypeMapper {

    List<Type> getAll();

    Type getByTid(@Param("tId") int tId);

    public int addType(Type type);

    Type getBytName(@Param("tName") String tName);

    int deleteType(@Param("tId")int tId);

}
