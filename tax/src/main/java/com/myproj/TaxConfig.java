package com.myproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dumin on 6/16/17.
 */
@Configuration
public class TaxConfig {

    @Bean
    public MultipleDevideService upsaRestClient(TaxProperties properties) {
        return new MultipleDevideService(properties);
    }
}


