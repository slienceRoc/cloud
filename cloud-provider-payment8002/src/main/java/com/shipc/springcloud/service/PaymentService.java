package com.shipc.springcloud.service;

import com.shipc.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public Long create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
