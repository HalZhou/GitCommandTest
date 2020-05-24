package com.example.gitcommanddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: 第一次更改 ");
        Log.d(TAG, "onCreate: 第二次修改");
        Log.d(TAG, "onCreate: 第三次修改");
    }
}
