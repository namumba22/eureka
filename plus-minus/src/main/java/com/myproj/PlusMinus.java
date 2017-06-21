package com.myproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dumin on HZ koga.
 */

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.myproj"})
@PropertySource("classpath:plus-minus.properties")
@RestController
public class PlusMinus {

    @RequestMapping(value = "/plus/{amount}/{amount2:.+}", method = {RequestMethod.GET},
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public double multipleAndGet(@PathVariable final double amount, @PathVariable final double amount2) {
        return amount + amount2;
    }

    @RequestMapping(value = "/minus/{amount}/{amount2:.+}", method = {RequestMethod.GET},
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public double devideAndGet(@PathVariable final double amount, @PathVariable final double amount2) {
        return amount - amount2;
    }

    public static void main(String... args) throws Exception {
        SpringApplication.run(PlusMinus.class, args);
    }

}
