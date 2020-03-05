package com.custom.component;

import android.os.Bundle;
import android.util.Log;
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
private final String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 测试带跳转回调的调用
     *
     * @author Ysw created at
     */
    public void jumpLogin(View view) {
        Router.getInstance().build(RouterPath.LOGIN_MAIN).withString("name", "MainActivity传过来的名字").navigation(this, new NavigationCallback() {
            @Override
            public void onFound(Postcard postcard) {
                Log.d(TAG, "onFound: 成功找到了路由");
            }

            @Override
            public void onLost(Postcard postcard) {
                Log.d(TAG, "onLost: 没有找到对应的路由");
            }

            @Override
            public void onArrival(Postcard postcard) {
                Log.d(TAG, "onArrival: 跳转成功");
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
