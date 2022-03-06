package com.ShenHe.week6.homework;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import java.sql.*;
@WebListener
public class JDBCServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context =sce.getServletContext();
        String driver = context.getInitParameter("driver");
        String password = context.getInitParameter("password");
        String URL = context.getInitParameter("URL");
        String username = context.getInitParameter("username");
        try {
            Class.forName(driver);
           Connection conn = DriverManager.getConnection(URL, username, password);
            System.out.println("Connection -->" + conn);
            context.setAttribute("conn",conn);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
        sce.getServletContext().removeAttribute("conn");
    }
}
