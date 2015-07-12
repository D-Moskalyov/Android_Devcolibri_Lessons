package com.example.myapplication9.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import com.example.myapplication9.app.fragment.One;
import com.example.myapplication9.app.fragment.Two;


public class MainActivity extends FragmentActivity {

    private One oneFragment;
    private Two twoFragment;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        manager = getSupportFragmentManager();

        //twoFragment = new Two();
    }

    public void onClickFragment(View view){

        transaction = manager.beginTransaction();

        switch (view.getId()){

            case R.id.btnAdd:
                oneFragment = new One();
                transaction.add(R.id.container, oneFragment);
                break;

            default:break;

        }

        transaction.commit();
    }
}
