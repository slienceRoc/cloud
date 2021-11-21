package com.shipc.springcloud.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 功能描述:
 * 获取RestTemplate对象的配置类
 * @date 4:33 下午 2021/11/6
 * @param
 * @return
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
