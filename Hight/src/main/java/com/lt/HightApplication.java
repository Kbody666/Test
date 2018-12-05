package com.lt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages="com.lt.mapper")
@ComponentScan(basePackages= {"com.lt"})
public class HightApplication {

	public static void main(String[] args) {
		SpringApplication.run(HightApplication.class, args);
	}
}
