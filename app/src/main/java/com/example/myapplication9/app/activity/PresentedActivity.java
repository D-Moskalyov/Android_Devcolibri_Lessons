package com.example.myapplication9.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.myapplication9.app.R;
import com.example.myapplication9.app.util.RequestCode;


public class PresentedActivity extends Activity {

    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presented_layout);

        editText = (EditText)findViewById(R.id.editName);
    }

    public void onIntroduced(View view){
        Intent intent = new Intent();
        intent.putExtra("name", editText.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
