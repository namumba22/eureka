package com.myproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Created by dumin on HZ koga.
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.myproj"})
@PropertySource("classpath:rounder.properties")
@RestController
public class Rounder {

    private static final Logger logger = LoggerFactory.getLogger(Rounder.class);


    @RequestMapping(value = "/round/{amount}", method = {RequestMethod.GET},
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public double multipleAndGet(@PathVariable final double amount) {
        logger.info("rounding value - {}",amount);
            BigDecimal v = BigDecimal.valueOf(amount);
            BigDecimal roundOff = v.setScale(2, BigDecimal.ROUND_HALF_EVEN);
            return  roundOff.doubleValue();
    }

    public static void main(String... args) throws Exception {
        SpringApplication.run(Rounder.class, args);
    }

}