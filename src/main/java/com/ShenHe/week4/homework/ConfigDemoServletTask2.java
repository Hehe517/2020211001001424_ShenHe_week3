package com.ShenHe.week4.homework;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "ConfigDemoServletTask2",urlPatterns = {"/conig"},
        initParams = {
                @WebInitParam(name = "Name",value = "Shenhe"),
                @WebInitParam(name ="ID",value = "2020211001001424")
        },loadOnStartup = 1)

public class ConfigDemoServletTask2 extends HttpServlet {
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
