package com.saurabh.cms.Filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Filter_1 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("Filter 1 is called...");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
