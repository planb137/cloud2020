package cn.edu.nuaa.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author planb
 * @date 2020/4/18 09:16
 * 备注：
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClietMain3366 {
    public static void main(String[] args)
    {
        SpringApplication.run(ConfigClietMain3366.class,args);
    }
}
