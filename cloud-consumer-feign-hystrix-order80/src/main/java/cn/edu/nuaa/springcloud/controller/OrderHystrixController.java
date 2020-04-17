package cn.edu.nuaa.springcloud.controller;

import cn.edu.nuaa.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author planb
 * @date 2020/4/16 10:44
 * 备注：
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "payment_Global_FallbackMethod")
public class OrderHystrixController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfo_OK(id);
        return result;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler",commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "1500")
//    })
    @HystrixCommand
    public String paymentInfo_Timeout(@PathVariable("id") Integer id) {
        int age = 10 / 0;
        String result = paymentHystrixService.paymentInfo_Timeout(id);
        return  result;
    }
    public String paymentInfo_TimeoutHandler(@PathVariable("id") Integer id) {
        return  "我是消费者80，对方支付系统微服务繁忙，请10秒钟后再试或自己出错，请检查自己，😭";
    }

    public String payment_Global_FallbackMethod(){
        return "Global异常处理，请稍后再试😭";
    }
}
