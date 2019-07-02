package org.gitlab4j.api.systemhooks;

import com.fasterxml.jackson.annotation.JsonIgnore;

public abstract class AbstractSystemHookEvent implements SystemHookEvent {

    private String requestUrl;
    private String requestQuesryString;
    private String requestSecretToken;

    @Override
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    @Override
    @JsonIgnore
    public String getRequestUrl() {
        return (requestUrl);
    }

    @Override
    public void setRequestQueryString(String requestQuesryString) {
        this.requestQuesryString = requestQuesryString;
    }

    @Override
    @JsonIgnore
    public String getRequestQueryString() {
        return (requestQuesryString);
    }

    @Override
    public void setRequestSecretToken(String requestSecretToken) {
        this.requestSecretToken = requestSecretToken;
    }

    @Override
    @JsonIgnore
    public String getRequestSecretToken() {
        return (requestSecretToken);
    }
}
