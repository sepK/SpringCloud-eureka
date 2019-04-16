package com.ecjtu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author t.k
 * @date 2018/12/10 15:52
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaClient extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaClient.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringCloudEurekaClient.class);
    }
}
