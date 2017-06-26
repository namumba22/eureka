package com.myproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by dumin on HZ koga.
 */
@ComponentScan
@EnableAutoConfiguration
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = {"com.myproj"})
@PropertySource("classpath:agregator.properties")
@RestController
public class Aggregator {

    @Autowired
    private MultipleDevideClient multipleDevideService;

    @Autowired
    private PlusMinusClient plusMinusClient;

    @Autowired
    CalculatorService calculatorService;

    @Autowired
    RounderClient round;

    @Autowired
    TaxClient taxClient;


    @RequestMapping(value = "/calculate/{price}/{quantity}", method = {RequestMethod.GET},
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public double calculateWOtaxRasdfasd(@PathVariable final double price, @PathVariable final double quantity) {
        double woTax = calculateWoTax(price, quantity);
        double tax = calculateTax();
        double discount = calculateDiscount(woTax);
        double amountWoDiscount = plusMinusClient.minusAndGet(woTax, discount);

        return plusMinusClient.minusAndGet(amountWoDiscount, tax);
    }

    private double calculateWoTax(double price, double quantity) {
        return round.round(multipleDevideService.multipleAndGet(price, quantity));
    }

    private double calculateTax() {
        return taxClient.tax();
    }

    private double calculateDiscount(double amount) {
        return  round.round(multipleDevideService.devideAndGet(amount, calculatorService.discount(amount)));
    }

    public static void main(String... args) throws Exception {
        SpringApplication.run(Aggregator.class, args);
    }

}
