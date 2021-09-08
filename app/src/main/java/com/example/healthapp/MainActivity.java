package com.example.healthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button subtn, nubtn,jubtn,cofbtn,fattfish,slepbtn,waterbtn,vitaminbtn,vegetablebtn,smokebtn,oilbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        subtn = findViewById(R.id.sugarId);
        nubtn = findViewById(R.id.nutId);
        jubtn = findViewById(R.id.junkId);
        cofbtn = findViewById(R.id.coffeId);
        fattfish = findViewById(R.id.fattyFishId);
        slepbtn = findViewById(R.id.sleepId);
        waterbtn = findViewById(R.id.waterId);
        vitaminbtn = findViewById(R.id.vitaminId);
        vegetablebtn = findViewById(R.id.vegetabeleId);
        smokebtn = findViewById(R.id.smokeId);
        oilbtn = findViewById(R.id.oilId);

        subtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,sugaractivity.class);
                startActivity(intent);
            }
        });

        nubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,nutactivity.class);
                startActivity(intent);
            }
        });
        jubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,junkactivity.class);
                startActivity(intent);
            }
        });

        cofbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,coffeActivity.class);
                startActivity(intent);
            }
        });

        fattfish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,fattyFish.class);
                startActivity(intent);
            }
        });

        slepbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,sleepActivity.class);
                startActivity(intent);
            }
        });

        waterbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,waterActivity.class);
                startActivity(intent);
            }
        });

        vitaminbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,vitaminActivity.class);
                startActivity(intent);
            }
        });

        vegetablebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,vegetableActivity.class);
                startActivity(intent);
            }
        });

        smokebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,smokeActivity.class);
                startActivity(intent);
            }
        });
        oilbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,oilActivity.class);
                startActivity(intent);
            }
        });

    }
}
