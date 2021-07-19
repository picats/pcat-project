package com.pcat.web;

import com.pcat.web.utils.ChannelUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author zhaoy
 **/
@SpringCloudApplication
@ComponentScan(value = "com.pcat.web", excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {
                ChannelUtil.class,
        })
})
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
