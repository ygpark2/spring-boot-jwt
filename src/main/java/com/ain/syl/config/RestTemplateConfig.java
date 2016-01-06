package com.ain.syl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * 
 * @since 2015.11.11
 * @author 박영규
 *
 */

@Configuration
public class RestTemplateConfig {

    @Bean(name="ecsiRestTemplate")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}