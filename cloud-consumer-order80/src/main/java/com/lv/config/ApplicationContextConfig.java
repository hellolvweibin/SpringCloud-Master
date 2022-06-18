/*
 *@Project ：SpringCloud-Master
 *@IDE     ：IntelliJ IDEA
 *@Author  ：Levi_Bee
 *@Description  ：
 *@Date    ：2022/6/7 5:07 下午
 */


package com.lv.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author levi_bee
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
