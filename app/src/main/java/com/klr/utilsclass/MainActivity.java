package com.klr.utilsclass;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.klr.utilsclass.utils.PrintLog;
import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PrintLog.v("hh");
        /**
         * 第三方log：https://github.com/orhanobut/logger#download
         */
        Logger.d("hello");
        Logger.d("hello %s %d", "world", 5);   // String.format
    }
}
