package com.example.clickhousedemo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class HitsV1 implements Serializable {
    private long watchID;

    private int javaEnable;

    private String title;

    private long  goodEvent;

    private Date eventTime;

    private Date eventDate;
}
