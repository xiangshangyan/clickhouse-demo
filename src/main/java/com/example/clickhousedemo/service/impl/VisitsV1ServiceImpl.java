package com.example.clickhousedemo.service.impl;

import com.example.clickhousedemo.entity.AvgVisitsV1;
import com.example.clickhousedemo.mapper.VisitsV1Mapper;
import com.example.clickhousedemo.service.VisitsV1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VisitsV1ServiceImpl implements VisitsV1Service {
    @Resource
    private VisitsV1Mapper visitsV1Mapper;

    @Override
    public List<AvgVisitsV1> selectByStartDateLimit10(String startTime, String endTime) {
        return visitsV1Mapper.findAvgVisitsByStartDateLimit10(startTime, endTime);
    }
}
