package com.example.admin.mvp_27_4.Presenter;

/**
 * Created by admin on 4/27/2017.
 */

public interface MainContract {
    interface View{
        void onLoginSuccess();
        void onLoginFail();
    }
    interface Presenter{
        void login(String id,String pass);
    }
}
