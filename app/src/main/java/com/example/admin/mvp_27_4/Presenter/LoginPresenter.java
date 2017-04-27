package com.example.admin.mvp_27_4.Presenter;

import com.example.admin.mvp_27_4.Model.DataSource;
import com.example.admin.mvp_27_4.Model.LocalDataSource;
import com.example.admin.mvp_27_4.Model.LoginRepository;

/**
 * Created by admin on 4/27/2017.
 */

public class LoginPresenter implements MainContract.Presenter{
    private MainContract.View view;
    private DataSource repository;
    public LoginPresenter(MainContract.View v){
        this.view=v;
        repository =new LoginRepository(new LocalDataSource());
    }
    @Override
    public void login(String id, String pass){
        repository.checkLogin(id, pass, new DataSource.Callback() {
            @Override
            public void loginSuccess() {
                view.onLoginSuccess();
            }

            @Override
            public void loginFail() {
                view.onLoginFail();
            }
        });
    }
}
