package com.shipc.springcloud.dao;

import com.shipc.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public Long create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
