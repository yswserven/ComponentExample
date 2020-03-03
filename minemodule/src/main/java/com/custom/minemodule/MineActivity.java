package com.custom.minemodule;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.custom.common.RouterPath;
import com.custom.router_annotation.annotation.Extra;
import com.custom.router_annotation.annotation.Route;
import com.custom.router_api.core.Router;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = RouterPath.MINE_MAIN)
public class MineActivity extends AppCompatActivity {

    @Extra
    public int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        Router.getInstance().inject(this);
        Toast.makeText(this, "age 这个变量的值 = " + age, Toast.LENGTH_SHORT).show();
        Log.d("Ysw", "onCreate: age 这个变量的值 = " + age);
    }

    public void jumpLogin(View view) {
        Router.getInstance().build(RouterPath.LOGIN_MAIN).withString("name", "这个是从MineActivity传过来的值").navigation();
    }

    public void jumpMain(View view) {
        Router.getInstance().build(RouterPath.APP_MAIN).navigation();
    }
}
