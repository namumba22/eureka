package com.myproj;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("${aggregator.plus-minus-service-name}")
public interface PlusMinusClient {

    @RequestMapping(value = "${aggregator.plus-and-get-url}", method = RequestMethod.GET)
        //TODO: replace with SPEL
    double plusAndGet
    (@PathVariable("a") final double amount,
     @PathVariable("b") final double amount2);

    @RequestMapping(value = "${aggregator.minus-and-get-url}", method = RequestMethod.GET)
        //TODO: replace with SPEL
    double minusAndGet(@PathVariable("a") final double amount,
                          @PathVariable("b") final double amount2);
}
