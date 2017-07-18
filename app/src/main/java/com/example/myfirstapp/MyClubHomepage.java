package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyClubHomepage extends AppCompatActivity {

    Button Homefrommyclubhomepage;
    Button Buypacksfrommyclubhomepage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_club_homepage);
        Homefrommyclubhomepage = (Button) findViewById(R.id.homefrommyclubhomepage);
        Homefrommyclubhomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(MyClubHomepage.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });
        Buypacksfrommyclubhomepage = (Button) findViewById(R.id.buypacksfrommyclubhomepage);
        Buypacksfrommyclubhomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BuyPacks = new Intent(MyClubHomepage.this, BuyPacks.class);
                startActivity(BuyPacks);
            }
        });
    }
}
