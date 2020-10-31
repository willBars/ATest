package com.xuyang.ljxs.egame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.jfyl.zgzh.nearme.gamecenter.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = findViewById(R.id.user_click);

    }
}
