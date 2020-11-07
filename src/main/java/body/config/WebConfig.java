package body.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

    @Configuration
    @EnableWebMvc
    @ComponentScan(basePackages = "body")
    public class WebConfig {

        @Bean
        ViewResolver viewResolver() {
            InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
            viewResolver.setPrefix("/WEB-INF/viewpages/");
            viewResolver.setSuffix(".jsp");
            return viewResolver;
        }
    }

