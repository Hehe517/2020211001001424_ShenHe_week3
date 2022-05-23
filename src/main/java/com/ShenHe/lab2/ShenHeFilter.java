package com.ShenHe.lab2;

import jakarta.servlet.*;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import javax.servlet.annotation.WebFilter;
import java.util.logging.Filter;

@WebFilter(filterName = "YourNameFilter")
public class ShenHeFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("YourNameFilter-- before chain()");
        chain.doFilter(req, resp);
        System.out.println("YourNameFilter-- after chain()");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
