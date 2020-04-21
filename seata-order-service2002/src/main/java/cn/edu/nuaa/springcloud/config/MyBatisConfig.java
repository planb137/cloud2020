package cn.edu.nuaa.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @auther planb
 * @date 2020-04-21 19:22
 */
@Configuration
@MapperScan({"cn.edu.nuaa.springcloud.dao"})
public class MyBatisConfig {
}
