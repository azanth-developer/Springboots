package com.Abhay.Login.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class modelLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long loginId;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @NotNull
    private String fullName;

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
