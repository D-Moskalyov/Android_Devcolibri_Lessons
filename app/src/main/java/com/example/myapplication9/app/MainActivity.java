package com.example.myapplication9.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.Toast;
import com.example.myapplication9.app.R;

public class MainActivity extends Activity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

    }

    public void showDialog(View view){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        builder.setTitle("Devcolibri")
                .setMessage("Privet")
                .setCancelable(true)
                .setIcon(R.drawable.ic_launcher)
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Disagree", Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Agree", Toast.LENGTH_SHORT).show();
                    }
                })
                .setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public void onCancel(DialogInterface dialog) {
                        Toast.makeText(getApplicationContext(), "Back", Toast.LENGTH_SHORT).show();
                    }
                });


        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}
