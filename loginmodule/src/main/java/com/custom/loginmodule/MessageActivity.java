package com.custom.loginmodule;

import android.os.Bundle;

import com.custom.common.model.RouterPath;
import com.custom.router_annotation.annotation.Route;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = RouterPath.LOGIN_MESSAGE)
public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }
}
