package cn.edu.nuaa.springcloud.controller;

import cn.edu.nuaa.springcloud.entities.CommonResult;
import cn.edu.nuaa.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @author planb
 * @date 2020/4/21 12:07
 * 备注：
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private  String serverPort;

    public static HashMap<Long, Payment> map = new HashMap<Long, Payment>();
    static {
        map.put(1L,new Payment(1L,"1111"));
        map.put(2L,new Payment(2L,"2222"));
        map.put(3L,new Payment(3L,"3333"));
    }

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {

        Payment payment = map.get(id);
        CommonResult<Payment> result = new CommonResult<Payment>(200,"from mysql,serverPort: " + serverPort,payment);
        return result;
    }
}
