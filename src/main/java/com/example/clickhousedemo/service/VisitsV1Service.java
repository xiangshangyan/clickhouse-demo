package com.example.clickhousedemo.service;

import com.example.clickhousedemo.entity.AvgVisitsV1;

import java.util.List;

public interface VisitsV1Service {
    List<AvgVisitsV1> selectByStartDateLimit10(String startTime, String endTime);
}
