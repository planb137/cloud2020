package cn.edu.nuaa.springcloud.service.impl;

import cn.edu.nuaa.springcloud.dao.PaymentDao;
import cn.edu.nuaa.springcloud.entities.Payment;
import cn.edu.nuaa.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author planb
 * @date 2020/4/13 15:36
 * 备注：
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentdao;

    @Override
    public int create(Payment payment) {
        return paymentdao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentdao.getPaymentById(id);
    }

}
