package com.custom.component;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.custom.minemodule.LoginActivity;
import com.custom.minemodule.LoginModel;

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
        tvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }
}
