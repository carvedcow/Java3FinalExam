package com.login.configuration;

//MVC Configuration

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan("com.login")
public class WebMvcConfiguration {
	@Bean
 public ViewResolver viewResolver() {
     InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
     viewResolver.setViewClass(JstlView.class);
     viewResolver.setPrefix("/WEB-INF/views/");
     viewResolver.setSuffix(".jsp");

     return viewResolver;
 }
}

