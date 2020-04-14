package cn.edu.nuaa.springcloud.controller;

import cn.edu.nuaa.springcloud.entities.CommonResult;
import cn.edu.nuaa.springcloud.entities.Payment;
import cn.edu.nuaa.springcloud.service.PaymentService;
import com.netflix.appinfo.InstanceInfo;
import com.sun.tools.internal.xjc.model.CElement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

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

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {

        int result = paymentService.create(payment);
        log.info("*****插入结果" + result+"O(∩_∩)O哈哈~");

        if (result > 0) {
            return new CommonResult(200, "插入数据库成功！serverPort  "+ serverPort,result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****插入结果" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功！serverPort  "+ serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询id"+id, null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery()
    {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("*****element: "+service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
