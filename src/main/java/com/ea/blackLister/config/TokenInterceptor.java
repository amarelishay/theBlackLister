package com.ea.blackLister.config;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.ClientHttpRequestInterceptor;

import java.io.IOException;

public class TokenInterceptor implements ClientHttpRequestInterceptor {

    private final String accessToken;
    private final String apiKey;

    public TokenInterceptor(String accessToken, String apiKey) {
        this.accessToken = accessToken;
        this.apiKey = apiKey;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().add("Authorization", "Bearer " + accessToken);
        request.getHeaders().add("x-api-key", apiKey);
        return execution.execute(request, body);
    }
}
