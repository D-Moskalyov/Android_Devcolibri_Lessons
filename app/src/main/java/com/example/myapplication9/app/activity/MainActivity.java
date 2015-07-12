package com.example.myapplication9.app.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.example.myapplication9.app.R;
import com.example.myapplication9.app.fragment.LastFragment;

public class MainActivity extends FragmentActivity {

    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();

        initFragmentLast();
    }

    private void initFragmentLast(){
        transaction = manager.beginTransaction();
        transaction.add(R.id.container, new LastFragment());
        transaction.commit();
    }

//    public void onClickButtonFragment(View view){
//        EditText editText = (EditText)findViewById(R.id.text);
//        TextView textView = (TextView)findViewById(R.id.textView);
//        textView.setText(editText.getText());
//
//    }
}
