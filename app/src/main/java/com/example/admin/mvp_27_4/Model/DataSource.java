package com.example.admin.mvp_27_4.Model;

import javax.security.auth.callback.Callback;

/**
 * Created by admin on 4/27/2017.
 */

public interface DataSource {
    void checkLogin(String id, String pass, Callback callback);
    interface Callback{
        void loginSuccess();
        void loginFail();
    }

}
