package com.example.myfirstapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class Season extends AppCompatActivity {



    Button backtohome;
    Button buypacksseasons;
    Button PLAYMATCHSEASONS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season);
        backtohome = (Button) findViewById(R.id.backtohome);
        backtohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(Season.this, MainActivity.class);
                startActivity(MainActivity);
            }

            });
        buypacksseasons = (Button) findViewById(R.id.buypacksseasons);
        buypacksseasons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent BuyPacks  = new Intent(Season.this, BuyPacks.class);
              startActivity(BuyPacks);
            }

        });

        PLAYMATCHSEASONS = (Button) findViewById(R.id.PLAYMATCHSEASONS);
        PLAYMATCHSEASONS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Pregame = new Intent(Season.this, Pregame.class);
                startActivity(Pregame);
            }

        });
    }

}
