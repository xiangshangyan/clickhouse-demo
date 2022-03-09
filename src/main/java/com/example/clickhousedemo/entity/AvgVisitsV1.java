package com.example.clickhousedemo.entity;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@ToString
public class AvgVisitsV1 {
    private String url;
    private BigDecimal avgDuration;
}
