package com.example.myapplication9.app;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Switch;
import com.example.myapplication9.app.fragment.One;
import com.example.myapplication9.app.fragment.Two;


public class MainActivity extends FragmentActivity {

    private One oneFragment;
    private Two twoFragment;

    private FragmentManager manager;
    private FragmentTransaction transaction;

    private Switch isBackStack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        manager = getSupportFragmentManager();

        oneFragment = new One();
        twoFragment = new Two();

        isBackStack = (Switch)findViewById(R.id.switchBackStack);
    }

    public void onClickFragment(View view){

        transaction = manager.beginTransaction();

        switch (view.getId()){

            case R.id.btnAdd:
                if(manager.findFragmentByTag(One.TAG) == null)
                    transaction.add(R.id.container, oneFragment, One.TAG);
                break;

            case R.id.btnRemove:
                if(manager.findFragmentByTag(One.TAG) != null)
                    transaction.remove(oneFragment);
                if(manager.findFragmentByTag(Two.TAG) != null)
                    transaction.remove(twoFragment);
                break;
            case R.id.btnReplace:
                if(manager.findFragmentByTag(One.TAG) != null)
                    transaction.replace(R.id.container, twoFragment, Two.TAG);
                if(manager.findFragmentByTag(Two.TAG) != null)
                    transaction.replace(R.id.container, oneFragment, One.TAG);
                break;

            default:break;

        }

        if(isBackStack.isChecked())
            transaction.addToBackStack(null);

        transaction.commit();
    }

}
