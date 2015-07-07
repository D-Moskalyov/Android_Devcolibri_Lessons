package com.example.myapplication9.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.example.myapplication9.app.R;
import com.example.myapplication9.app.util.RequestCode;

public class MainActivity extends Activity{

    private TextView txtname;
    private TextView txtlang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        txtname = (TextView)findViewById(R.id.txtName);
        txtlang = (TextView)findViewById(R.id.txtLang);
    }

    public void onShow(View v){
        Intent intent;
        switch (v.getId()){
            case R.id.btnPresented:
                intent = new Intent(this, PresentedActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_PRESENTED);
                break;
            case R.id.btnChooseLang:
                intent = new Intent(this, LanguageActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_CHOOSE_LANGUAGE);
                break;
            default: break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode == RESULT_OK){
            switch (requestCode){
                case RequestCode.REQUEST_CODE_PRESENTED:
                    String name = data.getStringExtra("name");
                    txtname.setText("Добро пожаловать " + name);
                    break;
                case RequestCode.REQUEST_CODE_CHOOSE_LANGUAGE:
                    String language = data.getStringExtra("language");
                    txtlang.setText("Your language " + language);
                    break;
                default: break;
            }

        }
        else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }
    }
}
