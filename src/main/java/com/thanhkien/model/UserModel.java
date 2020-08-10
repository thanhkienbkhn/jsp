package com.thanhkien.model;

public class UserModel {
    private String userName;
    private String fullName;

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(final String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(final String userName) {
        this.userName = userName;
    }
}
