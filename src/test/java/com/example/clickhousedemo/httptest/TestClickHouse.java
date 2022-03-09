package com.example.clickhousedemo.httptest;

import com.example.clickhousedemo.TestHttpRequestFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class TestClickHouse {
    private static String testFindByStartDateUrl = "http://localhost:8000?startTime=2013-03-23&endTime=2014-03-30";
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate(TestHttpRequestFactory.simpleClientHttpRequestFactory());
        //设置请求头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.ALL));
//        headers.set("Authorization", token);
//        String body = "{\"username\":\"wechatMiniProgram\",\"password\":\"9ijdhfj2n\"}";
        //  封装参数，千万不要替换为Map与HashMap，否则参数无法传递
//        HttpEntity<String> requestEntity = new HttpEntity<>(body, headers);
        //  执行HTTP请求
        ResponseEntity<String> forEntity = restTemplate.exchange(testFindByStartDateUrl, HttpMethod.GET, null, String.class);  //最后的参数需要用String.class  使用其他的会报错
//        ResponseEntity<String> forEntity = restTemplate.getFor、Entity("http://localhost:10010/showyu-auth-center/api/v1/third/accounts/login", String.class);
        if (forEntity.hasBody()) {
            System.out.println(forEntity.getBody());

        }
    }
}
