package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Settings extends AppCompatActivity {

    Button backtohomefromsettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        backtohomefromsettings = (Button) findViewById(R.id.backtohomefromsettings);
        backtohomefromsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(Settings.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });
    }
}
