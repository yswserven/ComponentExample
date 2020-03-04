package com.custom.component;

import android.os.Bundle;
import android.view.View;

import com.custom.common.interf.CommonInterface;
import com.custom.common.model.RouterPath;
import com.custom.router_annotation.annotation.Route;
import com.custom.router_api.callback.NavigationCallback;
import com.custom.router_api.core.Postcard;
import com.custom.router_api.core.Router;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = RouterPath.APP_MAIN)
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpLogin(View view) {
        Router.getInstance().build(RouterPath.LOGIN_MAIN).withString("name", "MainActivity传过来的名字").navigation(this, new NavigationCallback() {
            @Override
            public void onFound(Postcard postcard) {

            }

            @Override
            public void onLost(Postcard postcard) {

            }

            @Override
            public void onArrival(Postcard postcard) {

            }
        });
    }

    public void jumpMine(View view) {
        Router.getInstance().build(RouterPath.MINE_MAIN).withInt("age", 30).navigation();
    }

    public void getLoginInfo(View view) {
        CommonInterface navigation = (CommonInterface) Router.getInstance().build(RouterPath.LOGIN_LOGIN_INFO).navigation();
        navigation.contact("这个是 APP MainActivity 的 msg ");
    }
}
