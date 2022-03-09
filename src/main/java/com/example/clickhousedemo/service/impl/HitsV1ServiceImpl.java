package com.example.clickhousedemo.service.impl;

import com.example.clickhousedemo.entity.HitsV1;
import com.example.clickhousedemo.mapper.HitsV1Mapper;
import com.example.clickhousedemo.service.HitsV1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HitsV1ServiceImpl implements HitsV1Service {
    @Resource
    private HitsV1Mapper hitsV1Mapper;

    @Override
    public HitsV1 selectByWatchId(long watchId) {
        return hitsV1Mapper.selectByWatchId(watchId);
    }
}
