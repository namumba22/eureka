package com.myproj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dumin on 6/16/17.
 */
public class CalculatorService {

    @Autowired
    private DiscoveryClient discoveryClient;
    private final RestTemplate restTemplate  = new RestTemplate();
    private final AggregatorProperties properties;

    public CalculatorService(AggregatorProperties properties) {
        this.properties = properties;
    }




    public double discount(double amount) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(getDiscountUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                amount
        ).getBody();
    }

    private String getDiscountUrl() {
        return discoveryClient.getInstances(properties.getDiscountServiceName()).get(0).getUri().toASCIIString() +
                properties.getDiscountUrl();
    }
}
