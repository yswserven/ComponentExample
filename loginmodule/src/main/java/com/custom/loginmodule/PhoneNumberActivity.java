package com.custom.loginmodule;

import android.os.Bundle;
import android.view.View;

import com.custom.common.model.RouterPath;
import com.custom.router_annotation.annotation.Route;
import com.custom.router_api.core.Router;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = RouterPath.LOGIN_PHONE)
public class PhoneNumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
    }

    public void jumpMessage(View view) {
        Router.getInstance().build(RouterPath.LOGIN_MESSAGE).navigation();
    }
}
