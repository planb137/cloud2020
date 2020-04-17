package cn.edu.nuaa.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author planb
 * @date 2020/4/16 14:04
 * 备注：
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "---- payment fall back, paymentInfo_OK（）  Timeout,😿";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "---- payment fall back, paymentInfo_Timeout（）  Timeout,😿";
    }
}
