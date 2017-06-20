package com.myproj;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created by dumin on 6/16/17.
 */
public class MultipleDevideService {


    private final RestTemplate restTemplate  = new RestTemplate();
    private final TaxProperties properties;

    public MultipleDevideService(TaxProperties properties) {
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


}
