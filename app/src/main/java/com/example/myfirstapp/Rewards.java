package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rewards extends AppCompatActivity {
    Button PLAYNEXTMATCHfromrewards;
    Button homefromrewards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);
        PLAYNEXTMATCHfromrewards = (Button) findViewById(R.id.PLAYNEXTMATCHfromrewards);
        PLAYNEXTMATCHfromrewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Season = new Intent(Rewards.this, Season.class);
                startActivity(Season);
            }
        });
        homefromrewards = (Button) findViewById(R.id.homefromrewards);
        homefromrewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(Rewards.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });
    }

}
