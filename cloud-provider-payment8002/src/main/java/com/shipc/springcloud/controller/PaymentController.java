package com.shipc.springcloud.controller;

import com.shipc.springcloud.entity.CommonResult;
import com.shipc.springcloud.entity.Payment;
import com.shipc.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * 功能描述:
 * 支付controlller
 * @date 11:16 下午 2021/11/4
 * @param
 * @return
 */
@RestController
@RequestMapping("/payment")
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 功能描述:
     * 保存支付信息
     * @date 11:21 下午 2021/11/4
     * @param [payment]
     * @return com.shipc.springcloud.entity.CommonResult<java.lang.Integer>
     */
    @PostMapping("/create")
    public CommonResult<Long> create(@RequestBody Payment payment) {
        Long id = paymentService.create(payment);

        log.info("**********插入结果：" + id);

        if (id > 0) {
            return new CommonResult(200, "插入成功", id);
        } else {
            return new CommonResult(-1, "插入失败", null);
        }
    }

    @GetMapping("/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);

        log.info("**********查询结果：" + payment);

        if (null != payment) {
            return new CommonResult(200, "查询成功: " + serverPort, payment);
        } else {
            return new CommonResult(-1, "查询失败：id= " + id + ", "+ serverPort, null);
        }
    }

}
