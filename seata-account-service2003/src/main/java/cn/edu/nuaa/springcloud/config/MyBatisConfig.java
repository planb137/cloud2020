package cn.edu.nuaa.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"cn.edu.nuaa.springcloud.dao"})
public class MyBatisConfig {
}
