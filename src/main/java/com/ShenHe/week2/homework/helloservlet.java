package com.ShenHe.week2.homework;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class helloservlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer =response.getWriter();
        writer.println("Name:ShenHe");
        writer.println("ID:2020211001001424");
        writer.println("Date and Time Sun Mar 6 21:26:44 CST 2022 ");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    {

    }

}
