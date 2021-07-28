package com.pcat.module.test;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zhaoy
 **/
@SpringCloudApplication
@ComponentScan(value = "com.pcat")
public class PcatApplication {
    public static void main(String[] args) {
        SpringApplication.run(PcatApplication.class, args);
    }
}
