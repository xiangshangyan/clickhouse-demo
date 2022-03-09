package com.example.clickhousedemo;

import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;

public class TestHttpRequestFactory {

    public static ClientHttpRequestFactory simpleClientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(500000);//单位为ms
        factory.setConnectTimeout(500000);//单位为ms
        return factory;
    }
}
