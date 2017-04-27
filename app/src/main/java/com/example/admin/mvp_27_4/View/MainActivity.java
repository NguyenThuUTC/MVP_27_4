package com.example.admin.mvp_27_4.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.mvp_27_4.Presenter.LoginPresenter;
import com.example.admin.mvp_27_4.Presenter.MainContract;
import com.example.admin.mvp_27_4.R;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    EditText edtUsername;
    EditText edtPass;
    Button btnLogin;
    LoginPresenter loginPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPass= (EditText) findViewById(R.id.edtPass);
        edtUsername= (EditText) findViewById(R.id.edtUsername);
        btnLogin= (Button) findViewById(R.id.btnLogin);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = edtUsername.getText().toString();
                String pass= edtPass.getText().toString();
                loginPresenter.login(id,pass);
            }
        });
    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFail() {
        Toast.makeText(this, "Login fail", Toast.LENGTH_SHORT).show();

    }
}
