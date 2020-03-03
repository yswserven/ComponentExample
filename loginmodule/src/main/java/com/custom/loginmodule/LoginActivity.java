package com.custom.loginmodule;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.custom.common.RouterPath;
import com.custom.router_annotation.annotation.Route;
import com.custom.router_api.core.Router;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = RouterPath.LOGIN_MAIN)
public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView tvName = findViewById(R.id.tv_name);
        tvName.setText("这个是登录界面");
    }

    public void jumpMine(View view){
        Router.getInstance().build(RouterPath.MINE_MAIN).navigation();
    }

    public void jumpMain(View view){
        Router.getInstance().build(RouterPath.APP_MAIN).navigation();
    }
}
