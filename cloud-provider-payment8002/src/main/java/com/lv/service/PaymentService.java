/*
 *@Project ：SpringCloud-Master
 *@IDE     ：IntelliJ IDEA
 *@Author  ：Levi_Bee
 *@Description  ：
 *@Date    ：2022/6/7 1:30 下午
 */


package com.lv.service;

import com.lv.entity.Payment;
import org.apache.ibatis.annotations.Param;


/**
 * @author levi_bee
 */

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
