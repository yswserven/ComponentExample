package com.custom.loginmodule;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.custom.common.model.RouterPath;
import com.custom.router_annotation.annotation.Extra;
import com.custom.router_annotation.annotation.Route;
import com.custom.router_api.core.Router;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = RouterPath.LOGIN_MAIN)
public class LoginActivity extends AppCompatActivity {

    @Extra
    public String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Router.getInstance().inject(this);
        TextView tvName = findViewById(R.id.tv_name);
        tvName.setText("这个是登录界面");
        Toast.makeText(this, "name 这个变量的值 = " + name, Toast.LENGTH_SHORT).show();
        Log.d("Ysw", "onCreate: name 这个变量的值 = " + name);
    }

    public void jumpMine(View view) {
        Router.getInstance().build(RouterPath.MINE_MAIN).withInt("age", 100).navigation();
    }

    public void jumpMain(View view) {
        Router.getInstance().build(RouterPath.APP_MAIN).navigation();
    }

    public void jumpPhone(View view) {
        Router.getInstance().build(RouterPath.LOGIN_PHONE).navigation();
    }

    public void jumpMessage(View view) {
        Router.getInstance().build(RouterPath.LOGIN_MESSAGE).navigation();
    }
}
