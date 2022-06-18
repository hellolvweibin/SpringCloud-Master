/*
 *@Project ：SpringCloud-Master
 *@IDE     ：IntelliJ IDEA
 *@Author  ：Levi_Bee
 *@Description  ：
 *@Date    ：2022/6/7 1:18 下午
 */


package com.lv.dao;

import com.lv.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author levi_bee
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
