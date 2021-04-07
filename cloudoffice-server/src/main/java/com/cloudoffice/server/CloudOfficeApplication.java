package com.cloudoffice.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cloudoffice.server.mapper")
public class CloudOfficeApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudOfficeApplication.class, args);
    }

}
