package com.myproj;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * Created by dumin on 6/16/17.
 */
@Component
@ConfigurationProperties("tax")
public class TaxProperties {

    @NotNull
    private String devideAndGetUrl;
    @NotNull
    private String multipleDevideServiceName;

    public String getDevideAndGetUrl() {
        return devideAndGetUrl;
    }

    public void setDevideAndGetUrl(String devideAndGetUrl) {
        this.devideAndGetUrl = devideAndGetUrl;
    }

    public String getMultipleDevideServiceName() {
        return multipleDevideServiceName;
    }

    public void setMultipleDevideServiceName(String multipleDevideServiceName) {
        this.multipleDevideServiceName = multipleDevideServiceName;
    }
}


