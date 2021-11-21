package com.shipc.springcloud.controller;

import com.shipc.springcloud.entity.CommonResult;
import com.shipc.springcloud.entity.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 功能描述:
 * 订单container
 * @date 4:35 下午 2021/11/6
 * @param
 * @return
 */
// 返回对象为json xml 使用
@RestController
// 路由映射
@RequestMapping("/order")
public class OrderController {

    private static final String URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/create")
    public CommonResult<Long> create(Payment payment) {
        return restTemplate.postForObject(URL + "/payment/create", payment, CommonResult.class);
    }

    /**
     * 功能描述:
     * 获取peyment对象
     * @date 5:05 下午 2021/11/6
     * @param [id]
     * @return com.shipc.springcloud.entity.CommonResult<com.shipc.springcloud.entity.Payment>
     */
    @GetMapping("getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL + "/payment/getPaymentById/" + id,  CommonResult.class);
    }
}
