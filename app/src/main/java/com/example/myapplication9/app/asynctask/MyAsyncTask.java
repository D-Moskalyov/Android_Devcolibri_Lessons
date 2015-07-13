package com.example.myapplication9.app.asynctask;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;

import java.util.concurrent.TimeUnit;

public class MyAsyncTask extends AsyncTask<Void, Void, Void> {

    private int progressBarValue = 0;

//    @Override
//    protected void onPostExecute(String s) {
//        super.onPostExecute(s);
//    }


    @Override
    protected Void doInBackground(Void... params) {
        try {
            for (int i = 0 ; i < 10; i++){
                Log.i("[MY TASK]", "Task is working...");
                Log.i("[MY TASK]", "Task canceled..." + isCancelled());
                TimeUnit.SECONDS.sleep(2);
                if(isCancelled()){
                    this.cancel(true);
                    return null;
                }
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
        }

        return null;
    }
}