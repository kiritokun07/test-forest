package com.kirito.test.controller;

import com.kirito.test.aop.TransferRequest;
import com.kirito.test.client.TestClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final TestClient testClient;

    //forest请求的拦截器里加header
    @GetMapping("/test1")
    public String test1() {
        String res = testClient.doPost("http://localhost:7755/test/test1");
        System.out.println(res);
        return "Hello1";
    }

    //aop转发请求
    @TransferRequest(url = "http://localhost:7755/test/test1")
    @GetMapping("/test2")
    public String test2() {
        return "Hello2";
    }

}
