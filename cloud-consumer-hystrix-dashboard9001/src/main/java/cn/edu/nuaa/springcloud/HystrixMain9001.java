package cn.edu.nuaa.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author planb
 * @date 2020/4/16 15:41
 * 备注：
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixMain9001 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixMain9001.class,args);
    }
}
