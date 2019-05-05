package com.asiainfo.o2p.iov;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.asiainfo.o2p.iov.dao.mapper")
@SpringBootApplication
@EnableTransactionManagement
public class IovApplication {

	public static void main(String[] args) {
		SpringApplication.run(IovApplication.class, args);
	}
}
