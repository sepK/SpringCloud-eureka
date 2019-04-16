package com.ecjtu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author t.k
 * @date 2018/12/10 15:29
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringCloudEurekaServer.class);
    }
}
