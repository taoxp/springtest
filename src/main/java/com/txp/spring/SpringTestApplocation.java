package com.txp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: taoxp
 * @create: 2020-11-04 17:45
 */
@SpringBootApplication
public class SpringTestApplocation {
    public static void main(String[] args) {
        SpringApplication application=new SpringApplication(SpringTestApplocation.class);
        application.run(args);
    }
}
