package cn.edu.nuaa.springcloud.service;

import cn.edu.nuaa.springcloud.entities.CommonResult;
import cn.edu.nuaa.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author planb
 * @date 2020/4/21 12:43
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，---PaymentFallbackService",new Payment(id,"ErrorSerial"));
    }
}
