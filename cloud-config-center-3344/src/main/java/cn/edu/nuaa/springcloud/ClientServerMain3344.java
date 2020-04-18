package cn.edu.nuaa.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author planb
 * @date 2020/4/17 14:36
 * 备注：
 */
@SpringBootApplication
@EnableConfigServer
public class ClientServerMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ClientServerMain3344.class,args);
    }
}
