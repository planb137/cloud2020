package cn.edu.nuaa.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author planb
 * @date 2020/4/19 09:10
 * 备注：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigNacosClientMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigNacosClientMain3377.class,args);
    }
}
