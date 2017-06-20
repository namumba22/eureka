package com.myproj;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dumin on 6/16/17.
 */
public class CalculatorService {


    private final RestTemplate restTemplate  = new RestTemplate();
    private final AggregatorProperties properties;

    public CalculatorService(AggregatorProperties properties) {
        this.properties = properties;
    }

    public double devideAndGet(double a, double b) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(properties.getDevideAndGetUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                a,
                b
        ).getBody();

    }

    public double multipleAndGet(double a, double b) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(properties.getMultipleAndGetUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                a,
                b
        ).getBody();
    }

    public double plusAndGet(double a, double b) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(properties.getPlusAndGetUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                a,
                b
        ).getBody();
    }

    public double minusAndGet(double a, double b) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(properties.getMinusAndGetUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                a,
                b
        ).getBody();
    }

    public double round(double a) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(properties.getRoundUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                a
        ).getBody();
    }

    public double tax() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(properties.getTaxUrl(),
                HttpMethod.GET,
                entity,
                Double.class
        ).getBody();
    }

    public double discount(double amount) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<?> entity = new HttpEntity<>(headers);

        return restTemplate.exchange(properties.getDiscountUrl(),
                HttpMethod.GET,
                entity,
                Double.class,
                amount
        ).getBody();
    }
}
