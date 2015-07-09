package com.example.myapplication9.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    private final String TAG = "DEV";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInfoLog(View view){
        Log.i(TAG, "Info Level");
    }

    public void onWarnLog(View view){
        Log.w(TAG, "Warn Level");
    }

    public void onErrorLog(View view){
        Log.e(TAG, "Error Level");
    }

    public void onDebugLog(View view){
        Log.d(TAG, "Debug Level");
        Log.v(TAG, "Verbose Level");
        Log.wtf(TAG, "WTF Level");
    }

}
