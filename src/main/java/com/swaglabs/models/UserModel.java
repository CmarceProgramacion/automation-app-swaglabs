package com.swaglabs.models;

import java.util.List;

public class UserModel {
    private String user;
    private String password;

    public UserModel(List<String> userData) {
        this.user = userData.get(0);
        this.password = userData.get(1);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
