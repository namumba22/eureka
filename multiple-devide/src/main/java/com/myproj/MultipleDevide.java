package com.myproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dumin on HZ koga.
 */

@ComponentScan
@EnableAutoConfiguration
@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.myproj"})
@PropertySource("classpath:multiple-devide.properties")
public class MultipleDevide {

    public static void main(String... args) throws Exception {
        SpringApplication.run(MultipleDevide.class, args);
    }

}
