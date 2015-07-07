package com.example.myapplication9.app.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.example.myapplication9.app.R;
import com.example.myapplication9.app.util.Language;

public class LanguageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_layout);
    }

    public void onSelectedLanguage(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.btnEng:
                intent = new Intent();
                intent.putExtra("language", Language.ENGLISH.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.btnRus:
                intent = new Intent();
                intent.putExtra("language", Language.RUSSIAN.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
            case R.id.btnUkr:
                intent = new Intent();
                intent.putExtra("language", Language.UKRAINIAN.getLanguage());
                setResult(RESULT_OK, intent);
                finish();
                break;
            default: break;
        }
    }
}
