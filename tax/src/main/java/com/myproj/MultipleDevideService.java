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
public class MultipleDevideService {

    @Autowired
    private DiscoveryClient discoveryClient;

    private final RestTemplate restTemplate = new RestTemplate();
    private final TaxProperties properties;

    public MultipleDevideService(TaxProperties properties) {
        this.properties = properties;
    }

    public double devideAndGet(double a, double b) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(getDevideAndGetUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                a,
                b
        ).getBody();
    }

    private String getDevideAndGetUrl() {
        return discoveryClient.getInstances(properties.getMultipleDevideServiceName()).get(0).getUri().toASCIIString() +
                properties.getDevideAndGetUrl();
    }


}
