package cn.edu.nuaa.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author planb
 * @date 2020/4/21 12:34
 * 备注：
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class PayemntConsumer84 {
    public static void main(String[] args) {
        SpringApplication.run(PayemntConsumer84.class,args);
    }
}
