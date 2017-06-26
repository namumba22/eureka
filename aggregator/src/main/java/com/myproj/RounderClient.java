package com.myproj;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("${aggregator.rounder-service-name}")
public interface RounderClient {

    @RequestMapping(value = "${aggregator.round-url}", method = RequestMethod.GET)
        //TODO: replace with SPEL
    double round(@PathVariable("a") final double amount);
}
