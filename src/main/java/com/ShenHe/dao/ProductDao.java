package com.ShenHe.dao;

import com.ShenHe.model.Product;
import com.ShenHe.model.User;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProductDao implements  IProductDao{
    @Override
    public int save(Product product, Connection con) throws SQLException {
        int n = 0;
        String sql = "insert into product(ProductName,ProductDescription,Picture,price,CategoryID) values(?,?,?,?,?)";
        PreparedStatement pt = con.prepareStatement(sql);
        pt.setString(1, product.getProductName());
        pt.setString(2, product.getProductDescription());
        if(product.getPicture()!=null) {
            //for sql server
            pt.setBinaryStream(3, product.getPicture());
            //for mysql
            //   pt.setBlob(3, product.getPicture());
        }
        pt.setDouble(4, product.getPrice());
        pt.setInt(5, product.getCategoryId());
        n = pt.executeUpdate();
        if (n > 0) {
            return n;
        }
        return 0;
    }//end save

    @Override
    public int delete(Integer productId, Connection con)   throws SQLException
    {
        String sql="delete instance set ?=? where productId =?";
        PreparedStatement pt= con.prepareStatement(sql);
        return 0;
    }


    @Override
    public int update(Product instance, Connection con) throws SQLException
    {
        String sql="update instance set ?=?";
        PreparedStatement pt= con.prepareStatement(sql);
        return 0;
    }

    @Override
    public Product findById(Integer productId, Connection con) throws SQLException {
        int n = 0;
        String sql = "select * from product where productId =?";
        PreparedStatement pt = con.prepareStatement(sql);
        n = pt.executeUpdate();
        return null;
    }

    @Override
    public List<Product> findByCategoryId(int categoryId, Connection con) throws SQLException{
        int n = 0;
        String sql = "select * from product where categoryId=?";
        PreparedStatement pt = con.prepareStatement(sql);
        n = pt.executeUpdate();
        return null;
    }

    @Override
    public List<Product> findByPrice(double minPrice, double maxPrice, Connection con) throws SQLException {
        int n = 0;
        String sql = "select * from product where price=?";
        PreparedStatement pt = con.prepareStatement(sql);
        n = pt.executeUpdate();
        return null;
    }

    @Override
    public List<Product> findAll(Connection con) throws SQLException {
        int n = 0;
        String sql = "select * from product";
        PreparedStatement pt = con.prepareStatement(sql);
        n = pt.executeUpdate();
        return null;
    }

    @Override
    public List<Product> findByProductName(String productName, Connection con) throws SQLException {
        int n = 0;
        String sql = "select * from product where productName=?";
        PreparedStatement pt = con.prepareStatement(sql);
        n = pt.executeUpdate();
        return null;
    }

    @Override
    public List<Product> getPicture(Integer productId, Connection con) throws SQLException {
        return null;
    }

    public int save(Product product, InputStream inputStream, Connection con) {
    }
}
