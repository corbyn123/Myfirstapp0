package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Endgame extends AppCompatActivity {
    Button buypacksfromendgame;
    Button homefromendgame;
    Button seasonsfromendgame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endgame);
        buypacksfromendgame = (Button) findViewById(R.id.buypacksfromendgame);
        buypacksfromendgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuyPacks = new Intent(Endgame.this, BuyPacks.class);
                startActivity(BuyPacks);
            }

        });

        homefromendgame = (Button) findViewById(R.id.homefromendgame);
        homefromendgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(Endgame.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });
        seasonsfromendgame = (Button) findViewById(R.id.seasonsfromendgame);
        seasonsfromendgame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Season = new Intent(Endgame.this, Season.class);
                startActivity(Season);
            }
        });
    }
}