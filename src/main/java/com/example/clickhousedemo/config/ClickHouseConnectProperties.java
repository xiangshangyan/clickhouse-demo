package com.example.clickhousedemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource.clickhouse")
@Data
public class ClickHouseConnectProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private Integer initialSize;
    private Integer maxActive;
    private Integer minIdle;
    private Integer maxWait;
}
