package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button shakeButton = findViewById(R.id.shakeButton);
        final ImageView magicBall = findViewById(R.id.magicBall);

        final int[] magicBalls = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball5,
                R.drawable.ball3,
                R.drawable.ball4
        };

        shakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randNumber = new Random();
                int number = randNumber.nextInt(5);
                magicBall.setImageResource(magicBalls[number]);
            }
        });
    }
}