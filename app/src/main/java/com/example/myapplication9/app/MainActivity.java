package com.example.myapplication9.app;

import android.app.Activity;
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

    public void onShow(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Privet", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
//        Toast.makeText(this, "Привет", Toast.LENGTH_LONG).show();

    }

}
