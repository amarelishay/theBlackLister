package com.ea.blackLister.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        String accessToken = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI3MjBlMmFjNjMyYjJhNGQ4MmU1MjUyYWQ1MzczMjE1MiIsIm5iZiI6MTcyMDE3Njg0NS4wMzYyOTcsInN1YiI6IjY2ODE4NWQwYmQyYWY1N2QyZGZmMTUwOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.clpPmmv3XzjhyXBiLoeOYJ1lwbdmJO1l38OkEDEz1Tw"; // Replace with your actual access token
        String apiKey = "720e2ac632b2a4d82e5252ad53732152";
        restTemplate.setInterceptors(Collections.singletonList(new TokenInterceptor(accessToken, apiKey)));
        return restTemplate;
    }
}
