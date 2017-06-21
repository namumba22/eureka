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

    @NotNull
    private String discountServiceName;
    @NotNull
    private String multipleDevideServiceName;
    @NotNull
    private String plusMinusServiceName;
    @NotNull
    private String rounderServiceName;
    @NotNull
    private String taxServiceName;



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

    public String getDiscountServiceName() {
        return discountServiceName;
    }

    public void setDiscountServiceName(String discountServiceName) {
        this.discountServiceName = discountServiceName;
    }

    public String getMultipleDevideServiceName() {
        return multipleDevideServiceName;
    }

    public void setMultipleDevideServiceName(String multipleDevideServiceName) {
        this.multipleDevideServiceName = multipleDevideServiceName;
    }

    public String getPlusMinusServiceName() {
        return plusMinusServiceName;
    }

    public void setPlusMinusServiceName(String plusMinusServiceName) {
        this.plusMinusServiceName = plusMinusServiceName;
    }

    public String getRounderServiceName() {
        return rounderServiceName;
    }

    public void setRounderServiceName(String rounderServiceName) {
        this.rounderServiceName = rounderServiceName;
    }

    public String getTaxServiceName() {
        return taxServiceName;
    }

    public void setTaxServiceName(String taxServiceName) {
        this.taxServiceName = taxServiceName;
    }
}


