package com.ShenHe.model;

import java.util.Date;

public class User {
    private String username;
    private String password;
    private String email;
    private String gender;
    private String birthdate;
    private String id;


    public User() {
    }

    public User( String id,String username, String password, String email, String gender, String birthdate) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.birthdate = birthdate;
        this.id=id;
    }

    public String getId() {
        return id;
    }

    public void setId(String username) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "User{" +"id='" + id + '\'' +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", birthdate=" + birthdate +
                '}';
    }
}
