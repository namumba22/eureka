package com.myproj;

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
@PropertySource("classpath:discount.properties")
@RestController
public class DiscountMatrix {

    @RequestMapping(value = "/discount/{amount:.+}", method = {RequestMethod.GET},
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public double getOrder(@PathVariable final double amount) {
        return getValue(amount);

    }

    private double getValue(double amount) {
        double retVal;
        if (amount < 1000) {
            retVal = 1;
        } else if (amount < 2000) {
            retVal = 1.1;
        } else if (amount < 3000) {
            retVal = 1.2;
        } else if (amount < 4000) {
            retVal = 1.3;
        } else {
            retVal = 1.5;
        }
        return retVal;
    }

    public static void main(String... args) throws Exception {
        SpringApplication.run(DiscountMatrix.class, args);
    }

}
