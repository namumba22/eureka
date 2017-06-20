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
@PropertySource("classpath:agregator.properties")
@RestController
public class Aggregator {

    @Autowired
    CalculatorService calculatorService;

    @RequestMapping(value = "/calculate/{price}/{quantity}", method = {RequestMethod.GET},
            produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
    @ResponseBody
    public double calculateWOtaxRasdfasd(@PathVariable final double price, @PathVariable final double quantity) {
        return calculateTotalWithDiscount(price, quantity);
    }

    private double calculateWoTax(double price, double quantity) {
        return calculatorService.round(calculatorService.multipleAndGet(price, quantity));
    }

    private double calculateTax() {
        return calculatorService.round(calculatorService.tax());
    }

    private double calculateDiscount(double amount) {
        return  calculatorService.round(calculatorService.devideAndGet(amount, calculatorService.discount(amount)));
    }

    private double calculateTotalWithDiscount(double price, double quantity) {
        double woTax = calculateWoTax(price, quantity);
        double tax = calculateTax();
        double discount = calculateDiscount(woTax);
        double amountWOdiscount = calculatorService.minusAndGet(woTax, discount);

        return calculatorService.minusAndGet(amountWOdiscount, tax);
    }

    public static void main(String... args) throws Exception {
        SpringApplication.run(Aggregator.class, args);
    }

}
