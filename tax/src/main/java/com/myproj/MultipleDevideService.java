package com.myproj;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dumin on 6/16/17.
 */
public class MultipleDevideService {


    private final RestTemplate restTemplate;

    public MultipleDevideService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public double devideAndGet(double a, double b) {
        return restTemplate.getForObject("/devide",Double.class,a,b);
    }

}
