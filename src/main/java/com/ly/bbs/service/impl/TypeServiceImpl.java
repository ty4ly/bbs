package com.ly.bbs.service.impl;

import com.ly.bbs.mapper.TypeMapper;
import com.ly.bbs.pojo.Type;
import com.ly.bbs.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@Service
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    @Override
    public List<Type> getAll() {
        return typeMapper.getAll();
    }

    @Override
    public Type getByTid(int tId) {
        return typeMapper.getByTid(tId);
    }

    @Override
    public int addType(Type type) {
        return typeMapper.addType(type);
    }

    @Override
    public Type getBytName(String tName) {
        return typeMapper.getBytName(tName);
    }

    @Override
    public int deleteType(int tId) {
        return typeMapper.deleteType(tId);
    }
}
