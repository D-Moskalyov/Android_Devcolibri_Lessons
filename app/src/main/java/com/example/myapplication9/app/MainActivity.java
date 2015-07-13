package com.example.myapplication9.app;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.example.myapplication9.app.R;

import com.example.myapplication9.app.asynctask.MyAsyncTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MainActivity extends Activity {

    private MyAsyncTask task;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        task = new MyAsyncTask();
    }

    public void onStartTask(View view) {

        task.execute();

    }

    public void onCancelTask(View view) {

        task.cancel(false);
    }

    public void onStatus(View view) {

        Toast.makeText(this, task.getStatus().toString(), Toast.LENGTH_SHORT).show();
    }
}
