package com.example.clickhousedemo.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
public class DruidConfig {
    @Resource
    private ClickHouseConnectProperties clickHouseConnectProperties;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();

        dataSource.setUrl(clickHouseConnectProperties.getUrl());
        dataSource.setDriverClassName(clickHouseConnectProperties.getDriverClassName());
        dataSource.setMaxActive(clickHouseConnectProperties.getMaxActive());
        dataSource.setMaxWait(clickHouseConnectProperties.getMaxWait());
        dataSource.setMinIdle(clickHouseConnectProperties.getMinIdle());
        dataSource.setInitialSize(clickHouseConnectProperties.getInitialSize());
        dataSource.setUsername(clickHouseConnectProperties.getUsername());
        dataSource.setPassword(clickHouseConnectProperties.getPassword());

        return dataSource;
    }
}
