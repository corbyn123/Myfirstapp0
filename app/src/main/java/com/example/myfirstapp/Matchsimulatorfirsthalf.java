package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Matchsimulatorfirsthalf extends AppCompatActivity {
    Button makesubfromfirsthalf;
    Button endmatchfromfirsthalf;
    Button halftimefromfirsthalf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchsimulatorfirsthalf);

        makesubfromfirsthalf = (Button) findViewById(R.id.makesubfromfirsthalf);
        makesubfromfirsthalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Makesubstitution = new Intent(Matchsimulatorfirsthalf.this, Makesubstitution.class);
                startActivity(Makesubstitution);
            }

        });
        endmatchfromfirsthalf = (Button) findViewById(R.id.endmatchfromfirsthalf);
        endmatchfromfirsthalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Endgame = new Intent(Matchsimulatorfirsthalf.this, Endgame.class);
                startActivity(Endgame);

            }

        });
        halftimefromfirsthalf = (Button) findViewById(R.id.halftimefromfirsthalf);
        halftimefromfirsthalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Halftime = new Intent(Matchsimulatorfirsthalf.this, Halftime.class);
                startActivity(Halftime);
            }
        });
    }
}

