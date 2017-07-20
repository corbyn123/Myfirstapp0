package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Halftime extends AppCompatActivity {

    Button gotosecondhalf;
    Button gotoendgamefromhalftime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halftime);

        gotosecondhalf = (Button) findViewById(R.id.gotosecondhalf);
        gotosecondhalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gamesimulatorsecondhalf = new Intent(Halftime.this, gamesimulatorsecondhalf.class);
                startActivity(gamesimulatorsecondhalf);
            }

        });
        gotoendgamefromhalftime = (Button) findViewById(R.id.gotoendgamefromhalftime);
        gotoendgamefromhalftime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Endgame = new Intent(Halftime.this, Endgame.class);
                startActivity(Endgame);
            }

        });


    }
}
