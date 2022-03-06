package com.ShenHe.controller;

import com.ShenHe.dao.ProductDao;
import com.ShenHe.model.Category;
import com.ShenHe.model.Product;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/productDetails")
public class ProductDetailsServlet extends HttpServlet {
    private Connection con = null;

    public void init() throws ServletException {
        con = (Connection) getServletContext().getAttribute("con");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;
        ProductDao productDao = new ProductDao();
        if (id == 0) {
            return;
        }

    List<Category> categoryList = Category.findAllCategory(con);
    request.setAttribute("categoryList",categoryList);
        try {
            Product product =productDao.findById(id,con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("categoryList",categoryList);
    String path="/WEB-INF/views-productDetails.jsp";
    request.getRequestDispatcher(path).forward(request,response);

}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
