package com.example.admin.mvp_27_4.Model;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.callback.Callback;

/**
 * Created by admin on 4/27/2017.
 */

public class LocalDataSource implements DataSource {

    @Override
    public void checkLogin(String id, String pass, Callback callback) {
        if (id.equals("abc") && pass.equals("123")){
            callback.loginSuccess();
        } else
            callback.loginFail();

        List<Object> a = new ArrayList<>();
    }
}
