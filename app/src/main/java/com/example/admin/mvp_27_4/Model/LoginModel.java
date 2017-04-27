package com.example.admin.mvp_27_4.Model;

/**
 * Created by admin on 4/27/2017.
 */

public class LoginModel {
    private String id;
    private String pass;

    public LoginModel(String id, String pass) {
        this.id = id;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
