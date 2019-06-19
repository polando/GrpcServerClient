package com.milq.grpcdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GrpcdemoApplication {

    @Bean
    public sayHello greeterService() {
        return new sayHello();
    }

    public static void main(String[] args) {
        SpringApplication.run(GrpcdemoApplication.class, args);
    }

}
