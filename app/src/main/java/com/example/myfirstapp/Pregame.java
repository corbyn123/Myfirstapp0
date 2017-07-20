package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pregame extends AppCompatActivity {

    Button gotomatchsimulatorfirsthalf;
    Button gotoseasonsfromprematch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_game);
        gotomatchsimulatorfirsthalf = (Button) findViewById(R.id.gotomatchsimulatorfirsthalf);
        gotomatchsimulatorfirsthalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Matchsimulatorfirsthalf = new Intent(Pregame.this, Matchsimulatorfirsthalf.class);
                startActivity(Matchsimulatorfirsthalf);
            }
        });
        gotoseasonsfromprematch = (Button) findViewById(R.id.gotoseasonsfromprematch);
        gotoseasonsfromprematch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Season = new Intent(Pregame.this, Season.class);
                startActivity(Season);
            }
        });
    }
}
