package com.example.clickhousedemo.mapper;

import com.example.clickhousedemo.entity.AvgVisitsV1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface VisitsV1Mapper {
    List<AvgVisitsV1> findAvgVisitsByStartDateLimit10(@Param("startDate") String startDate, @Param("endDate") String endDate);
}
