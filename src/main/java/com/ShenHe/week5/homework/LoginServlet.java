package com.ShenHe.week5.homework;

import com.ShenHe.dao.UserDao;
import com.ShenHe.model.User;
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
    public void init() throws ServletException {
        super.init();
        conn = (Connection) getServletContext().getAttribute("conn");
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
        request.getRequestDispatcher("WEB-INF/views/Login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserDao userDao = new UserDao();
        try {
            User user = userDao.findByUsernamePassword(conn, username, password);
            if (user != null) {
                request.setAttribute("user", user);
                request.getRequestDispatcher("WEB-INF/views/userInfo.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "username or password error!!");
                request.getRequestDispatcher("WEB-INF/views/Login.jsp").forward(request, response);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
       /* try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from usertable where username='shenhe' and password =123456");
            if (rs.next()) {
                request.setAttribute("username",rs.getString("username"));
                request.setAttribute("password",rs.getString("password"));
                request.setAttribute("email",rs.getString("email"));
                request.setAttribute("gender",rs.getString("gender"));
                request.setAttribute("birthdate",rs.getString("birthdate"));
                request.getRequestDispatcher("userInfo.jsp").forward(request,response);

            /*while (rs.next()) {
                if (rs.getString("username").equals(username) && rs.getString("password").equals(password)) {
                    PrintWriter writer = response.getWriter();
                    writer.println("Login successful");
                    writer.println("Welcome   " + username);
                }
            } else {
                request.setAttribute("message","username or password error!!");
                request.getRequestDispatcher("Login.jsp").forward(request,response);


                  /*  PrintWriter writer = response.getWriter();
                    writer.println("Sorry");
                    writer.println("Username or password Error");

            }


        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
*/