package com.ifernandez.dev.test.ProductsApi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
    import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Autowired
    private ApiConfig apiConfig;

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ifernandez.dev.test.ProductsApi"))
                .paths(PathSelectors.any())
                .build()
                .enable(apiConfig.getDevMode())
                .apiInfo(getApiInfo())
                ;
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("ProductsApi")
                .description("### Description\n Development of an API that provides the price and detail of a product selected.")
                .version(apiConfig.getVersion())
                .build();

    }


}
