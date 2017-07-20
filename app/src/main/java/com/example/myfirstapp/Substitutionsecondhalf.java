package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Substitutionsecondhalf extends AppCompatActivity {
    Button gotogamesimulatorsecondhalf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_substitutionsecondhalf);
        gotogamesimulatorsecondhalf = (Button) findViewById(R.id.gotogamesimulatorsecondhalf);
        gotogamesimulatorsecondhalf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gamesimulatorsecondhalf  = new Intent(Substitutionsecondhalf.this, gamesimulatorsecondhalf.class);
                startActivity(gamesimulatorsecondhalf);
            }

        });
    }
}
