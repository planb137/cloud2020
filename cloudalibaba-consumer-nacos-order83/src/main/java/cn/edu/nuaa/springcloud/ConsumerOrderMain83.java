package cn.edu.nuaa.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author planb
 * @date 2020/4/18 19:33
 * 备注：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOrderMain83 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderMain83.class,args);
    }
}
