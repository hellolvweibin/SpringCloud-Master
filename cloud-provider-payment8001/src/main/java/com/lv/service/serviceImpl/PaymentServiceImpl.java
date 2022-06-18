/*
 *@Project ：SpringCloud-Master
 *@IDE     ：IntelliJ IDEA
 *@Author  ：Levi_Bee
 *@Description  ：
 *@Date    ：2022/6/7 1:30 下午
 */


package com.lv.service.serviceImpl;

import com.lv.dao.PaymentDao;
import com.lv.entity.Payment;
import com.lv.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author levi_bee
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }
    @Override
    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }

}
