package com.custom.loginmodule;

import android.util.Log;

import com.custom.common.interf.CommonInterface;
import com.custom.common.model.RouterPath;
import com.custom.router_annotation.annotation.Route;

/**
 * Created by: Ysw on 2020/3/4.
 */
@Route(path = RouterPath.LOGIN_LOGIN_INFO)
public class LoginInfo implements CommonInterface {

    @Override
    public String contact(String msg) {
        Log.d("Ysw", "contact: msg = " + msg);
        return msg;
    }
}
