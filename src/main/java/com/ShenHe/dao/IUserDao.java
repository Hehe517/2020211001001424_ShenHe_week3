package com.ShenHe.dao;

import com.ShenHe.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public interface IUserDao {
    public boolean saveUser(Connection conn, User user) throws SQLException;
    public int deleteUser(Connection conn, User user) throws SQLException;
    public int updateUser(Connection conn, User user) throws SQLException;
    public User findByUsernamePassword(Connection conn, String username,String password) throws SQLException;
    public List<User> findByUsername(Connection conn, String username) throws SQLException;
    public List<User> findByPassword(Connection conn, String password) throws SQLException;
    public List<User> findByEmail(Connection conn,String email) throws SQLException;
    public List<User> findByGender(Connection conn,String gender) throws SQLException;
    public List<User> findByBirthdate(Connection conn, Date birthDate) throws SQLException;
    public List<User> findAllUser(Connection conn) throws SQLException;


}
