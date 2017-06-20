package com.myproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dumin on HZ koga.
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.myproj"})
@PropertySource("classpath:tax.properties")
@RestController
public class Tax {

    @Autowired
    MultipleDevideService multipleDevideService;

    @RequestMapping(value = "/tax/", method = {RequestMethod.GET},
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public double getOrder() {
        return multipleDevideService.devideAndGet(20,100);
    }

    public static void main(String... args) throws Exception {
        SpringApplication.run(Tax.class, args);
    }

}
