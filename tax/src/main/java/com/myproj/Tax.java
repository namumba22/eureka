package com.myproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dumin on HZ koga.
 */

//@ComponentScan
//@EnableAutoConfiguration
//@SpringBootApplication
//@EnableEurekaClient
//@EnableFeignClients
//@ComponentScan(basePackages = {"com.myproj"})
//@PropertySource("classpath:tax.properties")
//@RestController


@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.myproj"})
@PropertySource("classpath:tax.properties")
@RestController

public class Tax {

    public static void main(String... args) throws Exception {
        SpringApplication.run(Tax.class, args);
    }


//    @Autowired
//    private MultipleDevideClient multipleDevideService;

//    @Autowired
//    private RounderClient rounderClient;

    @RequestMapping(value = "/tax", method = RequestMethod.GET)
    public double getVaStatus() {
//        return multipleDevideService.devideAndGet(20, 99.5);
//        return rounderClient.round(multipleDevideService.devideAndGet(20, 99.5));
        return 12.11;
    }

}
