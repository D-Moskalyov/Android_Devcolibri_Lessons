package com.example.myapplication9.app.activity;

import POJO.PhoneModel;
import adapter.PhoneModelAdapter;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.myapplication9.app.R;

import java.util.*;

public class MainActivity extends ActionBarActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

//        List<String> items = initData();
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, items);

        PhoneModelAdapter adapter = new PhoneModelAdapter(this, initData());
        listView.setAdapter(adapter);
    }

    private List<PhoneModel> initData(){
        List<PhoneModel> list = new ArrayList<PhoneModel>();

        list.add(new PhoneModel(1, "IPhone", 1000));
        list.add(new PhoneModel(1, "HTC", 1000));
        list.add(new PhoneModel(1, "Samsung", 1000));
        list.add(new PhoneModel(1, "LG", 1000));

        return list;
    }

}
