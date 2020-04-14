package cn.edu.nuaa.springcloud.service;

import cn.edu.nuaa.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author planb
 * @date 2020/4/13 15:34
 * 备注：
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
