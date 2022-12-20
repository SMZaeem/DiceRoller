package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView ImageView;
    int random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView = findViewById(R.id.imageView);
        ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView.animate().rotationXBy(180);
                random = generaateRandom();
                displayImage(ImageView,random);

            }
        });
    }

    private void displayImage(ImageView imageView, int random) {
        switch (random){
            case 1 :
                imageView.setImageResource(R.drawable.dice1);
                Toast.makeText( this, random+"", Toast.LENGTH_LONG);
                break;
            case 2 :
                imageView.setImageResource(R.drawable.dice2);
                Toast.makeText( this, random+"", Toast.LENGTH_LONG);
                break;
            case 3 :
                imageView.setImageResource(R.drawable.dice3);
                Toast.makeText( this, random+"", Toast.LENGTH_LONG);
                break;
            case 4 :
                imageView.setImageResource(R.drawable.dice4);
                Toast.makeText( this, random+"", Toast.LENGTH_LONG);
                break;
            case 5 :
                imageView.setImageResource(R.drawable.dice5);
                Toast.makeText( this, random+"", Toast.LENGTH_LONG);
                break;
            case 6 :
                imageView.setImageResource(R.drawable.dice6);
                Toast.makeText( this, random+"", Toast.LENGTH_LONG);
                break;
        }
    }

    public int generaateRandom(){
        return (int)Math.ceil(Math.random()*6);

    }

}