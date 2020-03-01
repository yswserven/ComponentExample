package com.custom.component;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.custom.loginmodule.LoginModel;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvName = findViewById(R.id.tv_name);
        if (BuildConfig.isModule) {
            LoginModel loginModel = new LoginModel();
            loginModel.setName("杨胜文");
            tvName.setText(loginModel.getName());
        } else {
            Toast.makeText(this, "这个不是组件化，无法使用组件的东西", Toast.LENGTH_SHORT).show();
        }
    }
}
