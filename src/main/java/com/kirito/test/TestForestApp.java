package com.kirito.test;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ForestScan(basePackages = "com.kirito.test.client")
@SpringBootApplication
public class TestForestApp {

    public static void main(String[] args) {
        SpringApplication.run(TestForestApp.class, args);
    }

}
