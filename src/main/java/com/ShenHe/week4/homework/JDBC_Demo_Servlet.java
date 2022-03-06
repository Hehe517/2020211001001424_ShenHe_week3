package com.ShenHe.week4.homework;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.*;

public class JDBC_Demo_Servlet extends HttpServlet {
    Connection conn=null;
    @Override
    public void init() throws ServletException {
        super.init();
        //String URL = "jdbc:sqlserver://localhost:1433;database=UserDB;encrypt=false";
        //String USER = "sa";
        //String PASSWORD = "123456";
        //String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        ServletConfig config = getServletConfig();
        String driver = config.getInitParameter("driver");
        String PASSWORD = config.getInitParameter("PASSWORD");
        String URL = config.getInitParameter("URL");
        String USER = config.getInitParameter("USER");
        try{
                Class.forName(driver);
                conn= DriverManager.getConnection(URL,USER,PASSWORD);
                System.out.println("Connection -->"+conn);
            } catch ( ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

        }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
