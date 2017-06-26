package com.myproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by dumin on HZ koga.
 */

@SpringBootApplication
@EnableEurekaServer
@PropertySource("classpath:eureka-server.properties")
public class EurekaServiceApplication {


    public static void main(String... args) throws Exception {
        SpringApplication.run(EurekaServiceApplication.class, args);
    }

}
