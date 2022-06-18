/*
 *@Project ：SpringCloud-Master
 *@IDE     ：IntelliJ IDEA
 *@Author  ：Levi_Bee
 *@Description  ：
 *@Date    ：2022/6/7 4:58 下午
 */


package com.lv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author levi_bee
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80
{
    public static void main( String[] args ){
        SpringApplication.run(OrderMain80.class, args);
    }
}

