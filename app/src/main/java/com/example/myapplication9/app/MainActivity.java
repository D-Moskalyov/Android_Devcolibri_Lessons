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

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class MainActivity extends Activity {

    MyAsyncTask task;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        task = new MyAsyncTask();
    }

    public void onShowMessage(View view) throws ExecutionException, InterruptedException {

        task.execute();
        String text = null;
        try {
            text = task.get(2, TimeUnit.SECONDS);
            Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
        } catch (TimeoutException e) {
            Toast.makeText(MainActivity.this, "Not response", Toast.LENGTH_SHORT).show();
        }

    }

    class MyAsyncTask extends AsyncTask<Void, Void, String>{

        private int progressBarValue = 0;

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
        }


        @Override
        protected String doInBackground(Void... params) {
            SystemClock.sleep(3000);
            return "Hello";
        }
    }

}
