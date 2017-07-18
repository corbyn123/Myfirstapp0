package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Trophies extends AppCompatActivity {

    Button trophiestoseasons;
    Button trophiestohome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophies);

        trophiestoseasons = (Button) findViewById(R.id.trophiestoseasons);
        trophiestoseasons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Season = new Intent(Trophies.this, Season.class);
                startActivity(Season);
            }
        });
        trophiestohome = (Button) findViewById(R.id.trophiestohome);
        trophiestohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(Trophies.this, MainActivity.class);
                startActivity(MainActivity);

            }
        });
    }
}
