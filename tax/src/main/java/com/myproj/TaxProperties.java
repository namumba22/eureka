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
    private String serverUrl;
//    @NotNull
    private String restUrl;
//    @NotNull
    private String restAuthenticationUrl;
//    @NotNull
    private String login;
//    @NotNull
    private String password;

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getRestUrl() {
        return restUrl;
    }

    public void setRestUrl(String restUrl) {
        this.restUrl = restUrl;
    }

    public String getRestAuthenticationUrl() {
        return restAuthenticationUrl;
    }

    public void setRestAuthenticationUrl(String restAuthenticationUrl) {
        this.restAuthenticationUrl = restAuthenticationUrl;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


