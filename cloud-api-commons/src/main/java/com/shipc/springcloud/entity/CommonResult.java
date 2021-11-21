package com.shipc.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述:
 *
 * @date 1:00 下午 2021/11/4
 * @param
 * @return
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T      data;

    CommonResult(Integer code, String message) {
      this(code, message, null);
    }

}
