package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myfirstapp.R;

public class gamesimulatorsecondhalf extends AppCompatActivity {

    Button seerewards;
    Button endmatchfromsecondhalf;
    Button makesubfromsecondhalf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamesimulatorsecondhalf);


        seerewards = (Button) findViewById(R.id.seerewards);
        seerewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Rewards = new Intent(gamesimulatorsecondhalf.this, Rewards.class);
                startActivity(Rewards);
            }
        });
        endmatchfromsecondhalf = (Button) findViewById(R.id.endmatchfromsecondhalf);
        endmatchfromsecondhalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Endgame = new Intent(gamesimulatorsecondhalf.this, Endgame.class);
                startActivity(Endgame);
            }

        });
        makesubfromsecondhalf = (Button) findViewById(R.id.makesubfromsecondhalf);
        makesubfromsecondhalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Substitutionsecondhalf = new Intent(gamesimulatorsecondhalf.this, Substitutionsecondhalf.class);
                startActivity(Substitutionsecondhalf);
            }

        });
    }

        }

