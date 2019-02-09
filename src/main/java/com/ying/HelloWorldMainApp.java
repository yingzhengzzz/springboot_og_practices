package com.ying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 用来标注一个主程序类，说明这是一个 SpringBoot  应用
 */
@SpringBootApplication
public class HelloWorldMainApp {

    public static void main(String[] args) {
        //该命令启动spring application
        SpringApplication.run(HelloWorldMainApp.class, args);
    }
}
