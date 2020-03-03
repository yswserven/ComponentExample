package com.custom.minemodule;

import android.os.Bundle;
import android.view.View;

import com.custom.common.RouterPath;
import com.custom.router_annotation.annotation.Route;
import com.custom.router_api.core.Router;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = RouterPath.MINE_MAIN)
public class MineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
    }

    public void jumpLogin(View view){
        Router.getInstance().build(RouterPath.LOGIN_MAIN).navigation();
    }

    public void jumpMain(View view){
        Router.getInstance().build(RouterPath.APP_MAIN).navigation();
    }
}
