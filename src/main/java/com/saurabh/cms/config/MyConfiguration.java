package com.saurabh.cms.config;
import com.saurabh.cms.Filter.Filter_1;
import jakarta.servlet.FilterRegistration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean
    public FilterRegistrationBean<Filter_1> registrationBean(){
        FilterRegistrationBean<Filter_1> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new Filter_1());
        registrationBean.addUrlPatterns("/customers/*");
        return registrationBean;
    }
}
