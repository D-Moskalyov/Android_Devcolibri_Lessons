package com.example.myapplication9.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.myapplication9.app.R;
import com.example.myapplication9.app.service.MyService;


public class MainActivity extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartService(View view){
        startService(new Intent(this, MyService.class));
    }

    public void onStopService(View view){
        stopService(new Intent(this, MyService.class));
    }
}
