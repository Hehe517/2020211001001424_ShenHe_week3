package com.ShenHe.dao;

import com.ShenHe.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class UserDao implements IUserDao{

    @Override
    public boolean saveUser(Connection conn, User user) throws SQLException {
        String sql = "insert into usertable(username,password,email,gender,birthdate)" + "values('"  + "','"  + "','"  + "','"  + "','"  + "')";
        return false;
    }

    @Override
    public int deleteUser(Connection conn, User user) throws SQLException {
        String sql = "delete from usertable where user ='?'";
        return 0;
    }

    @Override
    public int updateUser(Connection conn, User user) throws SQLException {
        String sql = "UPDATE usertable set gender = 'female' where username ='mike'";
        return 0;
    }


    @Override
    public User findByUsernamePassword(Connection conn, String username, String password) throws SQLException {
        String sql="select username,password,email,gender,birthdate from usertable where username=? and password =?";
        PreparedStatement st =conn.prepareStatement(sql);
        st.setString(1,username);
        st.setString(2,password);
        ResultSet rs=st.executeQuery();
        User user = null;
        if(rs.next())
        {   user=new User();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthdate(rs.getString("birthdate"));
        }
        return user;
    }

    @Override
    public List<User> findByUsername(Connection conn, String username) throws SQLException {
        String sql="select * from usertable where username='shenhe'";
        PreparedStatement st =conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        User user;
        if(rs.next())
        {   user=new User();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthdate(rs.getString("birthdate"));
        }
        return null;
    }

    @Override
    public List<User> findByPassword(Connection conn, String password) throws SQLException {
        String sql="select * from usertable where password =123456";
        PreparedStatement st =conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        User user;
        if(rs.next())
        {   user=new User();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthdate(rs.getString("birthdate"));
        }
        return null;
    }

    @Override
    public List<User> findByEmail(Connection conn, String email) throws SQLException {
        String sql="select * from usertable where email ='1178939980@qq.com'";
        PreparedStatement st =conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        User user;
        if(rs.next())
        {   user=new User();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthdate(rs.getString("birthdate"));
        }
        return null;
    }

    @Override
    public List<User> findByGender(Connection conn, String gender) throws SQLException {
        String sql="select * from usertable where gender ='male'";
        PreparedStatement st =conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        User user;
        if(rs.next())
        {   user=new User();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthdate(rs.getString("birthdate"));
        }
        return null;
    }

    @Override
    public List<User> findByBirthdate(Connection conn, Date birthDate) throws SQLException {
        String sql="select * from usertable where birthdate ='2002-5-17'";
        PreparedStatement st =conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        User user;
        if(rs.next())
        {   user=new User();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthdate(rs.getString("birthdate"));
        }
        return null;
    }

    @Override
    public List<User> findAllUser(Connection conn) throws SQLException {
        String sql="select * from usertable";
        PreparedStatement st =conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery();
        User user=null;
        if(rs.next())
        {   user=new User();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setEmail(rs.getString("email"));
            user.setGender(rs.getString("gender"));
            user.setBirthdate(rs.getString("birthdate"));
        }
        return null;
    }
}
