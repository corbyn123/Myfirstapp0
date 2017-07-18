package com.example.myfirstapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class MainActivity extends AppCompatActivity {

    Typeface EASPORTS15;

    Button Play;
    Button Buypacks;
    Button MYCLUB;
    Button TROPHIES;
    Button SETTINGS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Play = (Button) findViewById(R.id.PLAY);
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Seasons = new Intent(MainActivity.this, Season.class);
                startActivity(Seasons);
            }
        });
        Buypacks = (Button) findViewById(R.id.BUYPACKS);
        Buypacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuyPacks = new Intent(MainActivity.this, BuyPacks.class);
                startActivity(BuyPacks);
            }

        });

        MYCLUB = (Button) findViewById(R.id.MYCLUB);
        MYCLUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyClubHomepage = new Intent(MainActivity.this, MyClubHomepage.class);
                startActivity(MyClubHomepage);
            }

        });

        TROPHIES = (Button) findViewById(R.id.TROPHIES);
        TROPHIES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Trophies = new Intent(MainActivity.this, Trophies.class);
                startActivity(Trophies);
            }

        });

        SETTINGS = (Button) findViewById(R.id.SETTINGS);
        SETTINGS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Settings = new Intent(MainActivity.this, Settings.class);
                startActivity(Settings);
            }

        });
    }
}
