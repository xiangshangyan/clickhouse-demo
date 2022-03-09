package com.example.clickhousedemo.mapper;

import com.example.clickhousedemo.entity.HitsV1;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface HitsV1Mapper {
    HitsV1 selectByWatchId(@Param("watchId") long watchId);
}
