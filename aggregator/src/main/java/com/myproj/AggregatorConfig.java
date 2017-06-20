package com.myproj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dumin on 6/16/17.
 */
@Configuration
public class AggregatorConfig {
    @Bean
    public CalculatorService upsaRestClient(AggregatorProperties properties) {
        return new CalculatorService(properties);
    }
}


