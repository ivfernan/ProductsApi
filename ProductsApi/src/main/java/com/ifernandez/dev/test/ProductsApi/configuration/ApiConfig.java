package com.ifernandez.dev.test.ProductsApi.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {
    @Value("${api.info.version}")
    @Getter
    private String version;

    @Value("${api.configuration.dev.mode:false}")
    @Getter
    private Boolean devMode;
}
