package com.example.myapplication9.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LastActivity extends Activity {

    private TextView txtLogin;
    private TextView txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);

        txtLogin = (TextView)findViewById(R.id.txtLogin);
        txtPassword = (TextView)findViewById(R.id.txtPassword);

        txtLogin.setText(getIntent().getStringExtra("login"));
        txtPassword.setText(getIntent().getStringExtra("password"));

    }

    public void onBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
