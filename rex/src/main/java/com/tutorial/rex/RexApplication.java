package com.tutorial.rex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class RexApplication {

    public static void main(String[] args) {
        SpringApplication.run(RexApplication.class, args);
    }

    /*
    @Bean
    public InternalResourceViewResolver setupViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix("/src/main/webapp/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    } */
}
