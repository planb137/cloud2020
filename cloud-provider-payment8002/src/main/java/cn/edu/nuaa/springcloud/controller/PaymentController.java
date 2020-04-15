package cn.edu.nuaa.springcloud.controller;

import cn.edu.nuaa.springcloud.entities.CommonResult;
import cn.edu.nuaa.springcloud.entities.Payment;
import cn.edu.nuaa.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author planb
 * @date 2020/4/13 15:41
 * 备注：
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {

        int result = paymentService.create(payment);
        log.info("*****插入结果" + result+"O(∩_∩)O哈哈~");

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功！serverPort  "+ serverPort,result);
        } else {
            return new CommonResult(444, "插入数据库失败 serverPort  "+ serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功！ serverPort"+ serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询id"+id, null);
        }
    }

    //测试OpenFegin超时控制
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            return serverPort;
        }
    }
}
