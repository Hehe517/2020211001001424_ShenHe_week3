package com.ShenHe.week3.homework;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.lang.ClassNotFoundException;
import java.lang.*;

public class RegisterServlet extends HttpServlet {
    Connection conn = null;

    @Override
    public void init() throws ServletException {
        super.init();
        //String URL = "jdbc:sqlserver://localhost:1433;database=UserDB;encrypt=false";
        //String USER = "sa";
        //String PASSWORD = "123456";
        //String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
       /* ServletConfig config = getServletConfig();
        String driver = config.getInitParameter("driver");
        String PASSWORD = config.getInitParameter("PASSWORD");
        String URL = config.getInitParameter("URL");
        String USER = config.getInitParameter("USER");
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection -->" + conn);
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from UserTable");
            //4.处理数据库的返回结果(使用ResultSet类)
            while (rs.next()) {
                System.out.println(rs.getString("id") + " " + rs.getString("username") + " " + rs.getString("password") + " " + rs.getString("email") + " " + rs.getString("gender") + " " + rs.getString("birthdate"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }*/
        conn = (Connection) getServletContext().getAttribute("conn");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    request.getRequestDispatcher("WEB-INF/views/register.jsp").forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String birthdate = request.getParameter("birthDate");
        try { PrintWriter out = response.getWriter();
            Statement st = conn.createStatement();
            String sql = "insert into usertable(id,username,password,email,gender,birthdate)" + "values('" + id + "','" + username + "','" + password + "','" + email + "','" + gender + "','" + birthdate + "')";
            System.out.println("sql" + sql);
            int n = st.executeUpdate(sql);
            System.out.println("n->>" + n);
            //sql = "select username,password,email,gender,birthdate from usertable";
            //ResultSet rs = st.executeQuery(sql);
   /*         out.println("<table border='2'>");
            out.println("<tr>");
            out.println("<td>username</td>");
            out.println("<td>password</td>");
            out.println("<td>email</td>");
            out.println("<td>gender</td>");
            out.println("<td>birthdate</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>rs.getString(\"username\")</td>");
            out.println("<td>rs.getString(\"password\")</td>");
            out.println("<td>rs.getString(\"email\")</td>");
            out.println("<td>rs.getString(\"gender\")</td>");
            out.println("<td>rs.getString(\"birthdate\")</td>");
            out.println("</tr>");
            out.println("</table>");
*/
           // request.setAttribute("name",rs);
           // request.getRequestDispatcher("userList.jsp").forward(request,response);
        response.sendRedirect("Login");
        }

        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

