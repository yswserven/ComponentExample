package com.custom.minemodule;

import android.os.Bundle;

import com.custom.common.RouterPath;
import com.custom.router_annotation.annotation.Route;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = RouterPath.MINE_MAIN)
public class MineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
    }
}
