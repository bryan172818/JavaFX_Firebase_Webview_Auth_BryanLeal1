package com.mycompany.mvvmexample;

public class UserSession {
    //class to help pass the user name between scenes

    private static UserSession instance;

    private String userName;

    private UserSession() {}

    public static UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
