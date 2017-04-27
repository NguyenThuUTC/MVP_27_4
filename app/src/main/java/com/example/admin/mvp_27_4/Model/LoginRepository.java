package com.example.admin.mvp_27_4.Model;

/**
 * Created by admin on 4/27/2017.
 */

public class LoginRepository implements DataSource{
    private DataSource dataSource;

    public LoginRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void checkLogin(String id, String pass, Callback callback) {
        dataSource.checkLogin(id,pass,callback);
    }


}
