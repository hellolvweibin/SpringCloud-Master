package com.lv;
/*
 *@Project ：SpringCloud-Master
 *@IDE     ：IntelliJ IDEA
 *@Author  ：Levi_Bee
 *@Description  ：
 *@Date    ：2022/6/7 1:03 下午
 */


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author levi_bee
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain001 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain001.class, args);
    }
}

