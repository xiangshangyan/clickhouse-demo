package com.example.clickhousedemo.Controller;

import com.example.clickhousedemo.entity.AvgVisitsV1;
import com.example.clickhousedemo.entity.HitsV1;
import com.example.clickhousedemo.service.HitsV1Service;
import com.example.clickhousedemo.service.VisitsV1Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestClickHouseController {

    @Resource
    private HitsV1Service hitsV1Service;
    @Resource
    private VisitsV1Service visitsV1Service;

    @GetMapping("/getHitsByWatchId")
    public HitsV1 getHitsByWatchId(long watchId) {
        return hitsV1Service.selectByWatchId(watchId);
    }

    @GetMapping("/getVisitsByStartDate")
    public List<AvgVisitsV1> getVisitsByStartDate(String startTime, String endTime) {
        return visitsV1Service.selectByStartDateLimit10(startTime, endTime);
    }
}
