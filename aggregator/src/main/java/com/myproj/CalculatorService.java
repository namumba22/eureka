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


    public double multipleAndGet(double a, double b) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(getMultipleAndGetUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                a,
                b
        ).getBody();
    }

    private String getMultipleAndGetUrl() {
        return discoveryClient.getInstances(properties.getMultipleDevideServiceName()).get(0).getUri().toASCIIString() +
                properties.getMultipleAndGetUrl();
    }


    public double plusAndGet(double a, double b) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(getPlusAndGetUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                a,
                b
        ).getBody();
    }

    private String getPlusAndGetUrl() {
        return discoveryClient.getInstances(properties.getPlusMinusServiceName()).get(0).getUri().toASCIIString() +
                properties.getPlusAndGetUrl();
    }


    public double minusAndGet(double a, double b) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(getMinusAndGetUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                a,
                b
        ).getBody();
    }

    private String getMinusAndGetUrl() {
        return discoveryClient.getInstances(properties.getPlusMinusServiceName()).get(0).getUri().toASCIIString() +
                properties.getMinusAndGetUrl();
    }

    public double round(double a) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(getRoundUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                a
        ).getBody();
    }
    private String getRoundUrl() {
        return discoveryClient.getInstances(properties.getRounderServiceName()).get(0).getUri().toASCIIString() +
                properties.getRoundUrl();
    }

    public double tax() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(getTaxUrl(),
                HttpMethod.GET,
                entity,
                Double.class
        ).getBody();
    }

    private String getTaxUrl() {
        return discoveryClient.getInstances(properties.getTaxServiceName()).get(0).getUri().toASCIIString() +
                properties.getTaxUrl();
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
