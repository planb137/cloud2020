package cn.edu.nuaa.sprincloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author planb
 * @date 2020/4/18 19:17
 * 备注：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentNacosMain9002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentNacosMain9002.class,args);
    }
}
