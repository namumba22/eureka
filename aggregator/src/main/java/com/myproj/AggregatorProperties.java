package com.myproj;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Created by dumin on 6/16/17.
 */
@Component
@ConfigurationProperties("aggregator")
public class AggregatorProperties {

    @NotNull
    private String devideAndGetUrl;
    @NotNull
    private String multipleAndGetUrl;
    @NotNull
    private String plusAndGetUrl;
    @NotNull
    private String minusAndGetUrl;
    @NotNull
    private String discountUrl;
    @NotNull
    private String roundUrl;
    @NotNull
    private String taxUrl;


    public String getDiscountUrl() {
        return discountUrl;
    }

    public void setDiscountUrl(String discountUrl) {
        this.discountUrl = discountUrl;
    }

    public String getRoundUrl() {
        return roundUrl;
    }

    public void setRoundUrl(String roundUrl) {
        this.roundUrl = roundUrl;
    }

    public String getDevideAndGetUrl() {
        return devideAndGetUrl;
    }

    public void setDevideAndGetUrl(String devideAndGetUrl) {
        this.devideAndGetUrl = devideAndGetUrl;
    }

    public String getMultipleAndGetUrl() {
        return multipleAndGetUrl;
    }

    public void setMultipleAndGetUrl(String multipleAndGetUrl) {
        this.multipleAndGetUrl = multipleAndGetUrl;
    }

    public String getPlusAndGetUrl() {
        return plusAndGetUrl;
    }

    public void setPlusAndGetUrl(String plusAndGetUrl) {
        this.plusAndGetUrl = plusAndGetUrl;
    }

    public String getMinusAndGetUrl() {
        return minusAndGetUrl;
    }

    public void setMinusAndGetUrl(String minusAndGetUrl) {
        this.minusAndGetUrl = minusAndGetUrl;
    }

    public String getTaxUrl() {
        return taxUrl;
    }

    public void setTaxUrl(String taxUrl) {
        this.taxUrl = taxUrl;
    }
}


