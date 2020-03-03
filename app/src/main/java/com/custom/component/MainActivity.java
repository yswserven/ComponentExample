package com.custom.component;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.custom.common.RouterPath;
import com.custom.router_annotation.annotation.Route;
import com.custom.router_api.core.Router;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = RouterPath.APP_MAIN)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvName = findViewById(R.id.tv_name);

    }

    public void jumpLogin(View view) {
        Router.getInstance().build(RouterPath.LOGIN_MAIN).navigation();
    }

    public void jumpMine(View view) {
        Router.getInstance().build(RouterPath.MINE_MAIN).navigation();
    }
}
