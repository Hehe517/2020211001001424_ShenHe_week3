package com.ShenHe.week4.homework;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

public class ConfigDemoServletTask1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer =response.getWriter();
        ServletConfig config = getServletConfig();
        String Name = config.getInitParameter("name");
        String ID = config.getInitParameter("ID");
        writer.println("Name:ShenHe");
        writer.println("ID:2020211001001424");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
