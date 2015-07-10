package com.example.myapplication9.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.example.myapplication9.app.R;

import java.util.*;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items, menu);
        return true;
    }

    public void onAbout(MenuItem item){
        Toast.makeText(this, "об авторе", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.settings:
                Toast.makeText(this, "Вы выбралм настройки", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this, "Вы выбралм об авторе", Toast.LENGTH_SHORT).show();
                break;
            case R.id.site:
                Toast.makeText(this, "Вы выбралм настройки", Toast.LENGTH_SHORT).show();
                break;
            default:break;
        }

        return true;
    }
}
