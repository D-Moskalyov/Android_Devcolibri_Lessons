package com.example.myapplication9.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.view.Gravity;


public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void onPosition(View view){
        Context context = getApplicationContext();
        Configuration configuration = getResources().getConfiguration();

        if(configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
            Toast.makeText(context, "ORIENTATION_PORTRAIT", Toast.LENGTH_SHORT).show();
        }
        if(configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Toast.makeText(context, "ORIENTATION_LANDSCAPE", Toast.LENGTH_SHORT).show();
        }
    }

}
