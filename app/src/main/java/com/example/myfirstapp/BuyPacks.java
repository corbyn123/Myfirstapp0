package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BuyPacks extends AppCompatActivity {

    Button playseasonsmatch;
    Button homefrombuypacks;
    Button myclubfrombuypacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_packs);
        playseasonsmatch = (Button) findViewById(R.id.playseasonsmatch);
        playseasonsmatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Season = new Intent(BuyPacks.this, Season.class);
                startActivity(Season);
            }


        });
        homefrombuypacks = (Button) findViewById(R.id.homefrombuypacks);
        homefrombuypacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(BuyPacks.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });
        myclubfrombuypacks = (Button) findViewById(R.id.myclubfrombuypacks);
        myclubfrombuypacks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MyClubHomepage = new Intent(BuyPacks.this, MyClubHomepage.class);
                startActivity(MyClubHomepage);
            }
        });
    }
}
