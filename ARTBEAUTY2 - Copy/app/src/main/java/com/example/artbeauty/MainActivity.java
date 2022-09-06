package com.example.artbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView newArt = findViewById(R.id.newArt);
        ;
        ImageView weird = findViewById(R.id.weirdArt);
        ImageView oil = findViewById(R.id.nftt);

newArt.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this,Twin.class);
        startActivity(intent);

    }
});

 weird.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent intent1 =new Intent(MainActivity.this,WeirdArt.class);
         startActivity(intent1);
     }
 });

 oil.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent intent2  = new Intent(MainActivity.this, Oil.class);
         startActivity(intent2);
     }
 });





    }
}
