package com.wyesc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@MapperScan(basePackages="com.wyesc.dao") //映射器扫描
@EnableTransactionManagement //启动事务管理
@SpringBootApplication //Spring核心注解：主要目的是开启自动配置，扫描本包及bean
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

