package com.myproj;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("${aggregator.tax-service-name}")
public interface TaxClient {

    @RequestMapping(value = "${aggregator.tax-url}", method = RequestMethod.GET)
    double tax();

}