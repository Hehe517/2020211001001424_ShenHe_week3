package com.ShenHe.week5.homework;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.*;

@WebServlet(name = "LoginServlet",value="/Login")
public class LoginServlet extends HttpServlet {
    Connection conn = null;
    @Override
    public  void init() throws ServletException {
        super.init();
        ServletConfig config = getServletConfig();
        String driver = config.getInitParameter("driver");
        String password = config.getInitParameter("password");
        String URL = config.getInitParameter("URL");
        String username = config.getInitParameter("username");
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(URL, username, password);
            System.out.println("Connection -->" + conn);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
        try {
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from usertable where username='Shenhe' and password =123 ");
        if("Shenhe".equals(username)&&"123".equals(password))
            {   PrintWriter writer =response.getWriter();
                writer.println("Login successful");
                writer.println("Welcome   "+username);
            }
        else
        {   PrintWriter writer =response.getWriter();
            writer.println("Sorry");
            writer.println("Username or password Error");
        }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
