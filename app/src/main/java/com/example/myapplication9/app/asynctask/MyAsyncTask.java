package com.example.myapplication9.app.asynctask;

import android.content.Context;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.util.Log;

import java.util.concurrent.TimeUnit;

public class MyAsyncTask extends AsyncTask<Void, Void, Void> {

    private static MyAsyncTask instance;
    private static Context context;

    public static MyAsyncTask getInstance(Context context) {
        if(instance == null) {
            instance = new MyAsyncTask();
            instance.execute();
        }

        setContext(context);
        return instance;
    }

    public static void setContext(Context context) {
        MyAsyncTask.context = context;
    }


//    public MyAsyncTask(Context context) {
//        this.context = context;
//    }


    @Override
    protected Void doInBackground(Void... params) {
        try {
            for (int i = 0 ; i < 20; i++){
                Log.i("[MY TASK]", "Task is working...");
                Log.i("[MY TASK]", "Task canceled..." + isCancelled());
                TimeUnit.SECONDS.sleep(2);
                printInfo();
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

    @Override
    protected void onPostExecute(Void aVoid) {
        instance = null;
        context = null;
    }

    private void printInfo(){
        Log.i("DEV_MODE", "CODE: " + this.hashCode() + " | " + context.hashCode());
    }
}