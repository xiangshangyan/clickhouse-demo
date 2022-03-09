package com.example.clickhousedemo;

import com.example.clickhousedemo.entity.AvgVisitsV1;
import com.example.clickhousedemo.service.VisitsV1Service;
import com.google.gson.Gson;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
@MapperScan(basePackages = {"com.example.clickhousedemo.mapper"})
public class ClickhouseDemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ClickhouseDemoApplication.class, args);
//        VisitsV1Service visitsV1Service = applicationContext.getBean(VisitsV1Service.class);
//
//        List<AvgVisitsV1> avgVisitsV1s = visitsV1Service.selectByStartDateLimit10("2013-03-23", "2014-03-30");
//        System.out.println(avgVisitsV1s.toString());
    }

}
