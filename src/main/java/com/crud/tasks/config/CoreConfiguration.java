package com.crud.tasks.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

@EnableScheduling
@Configuration
public class CoreConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public GroupedOpenApi groupedOpenApi(){

        return GroupedOpenApi.builder()
                .group("tasks")
                .pathsToMatch("/v1/tasks/**", "/v1/trello/**")
                .build();
    }

}