package com.example.demo;

import com.example.demo.Exception.RestTemplateResponseErrorHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")

public class DemoApplication {

    private final RestTemplateResponseErrorHandler responseErrorHandler;

    public DemoApplication(RestTemplateResponseErrorHandler responseErrorHandler) {
        this.responseErrorHandler = responseErrorHandler;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder()
                .errorHandler(responseErrorHandler)
                .build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                .build();
    }
}
