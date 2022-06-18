/*
 *@Project ：SpringCloud-Master
 *@IDE     ：IntelliJ IDEA
 *@Author  ：Levi_Bee
 *@Description  ：
 *@Date    ：2022/6/7 5:12 下午
 */


package com.lv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author levi_bee
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
