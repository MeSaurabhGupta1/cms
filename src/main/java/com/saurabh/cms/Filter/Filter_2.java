package com.saurabh.cms.Filter;

import jakarta.servlet.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Order(1)
public class Filter_2 implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("Filter 2 is called...");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
