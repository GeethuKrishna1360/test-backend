package com.aimsoft.piapp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name="user_id",length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column(name="user_name",length=255)
    private String username;

    @Column(name="email",length=255)
    private String email;

    @Column(name="phone",length=10)
    private Integer phone;

    @Column(name="password",length=255)
    private String password;


    public User() {
    }


    public User(Integer userId, String username, String email, Integer phone, String password) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", password='" + password + '\'' +
                '}';
    }
}


