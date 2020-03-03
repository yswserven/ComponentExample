package com.custom.component;

import android.app.Application;

import com.custom.router_api.core.Router;

/**
 * Created by: Ysw on 2020/3/3.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Router.init(this);
    }
}
