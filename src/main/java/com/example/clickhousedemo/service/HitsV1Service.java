package com.example.clickhousedemo.service;

import com.example.clickhousedemo.entity.HitsV1;

public interface HitsV1Service {
    HitsV1 selectByWatchId(long watchId);
}
