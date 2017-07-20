package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Makesubstitution extends AppCompatActivity {

    Button gotmatchsimulatorfirsthalf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makesubstitution);
        gotmatchsimulatorfirsthalf = (Button) findViewById(R.id.gotmatchsimulatorfirsthalf);
        gotmatchsimulatorfirsthalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Matchsimulatorfirsthalf = new Intent(Makesubstitution.this, Matchsimulatorfirsthalf.class);
                startActivity(Matchsimulatorfirsthalf);
            }
        });
    }

}
