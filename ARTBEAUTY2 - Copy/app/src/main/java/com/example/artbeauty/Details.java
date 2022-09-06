package com.example.artbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Details extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
   Bundle bundle= getIntent().getExtras();
   Itemm jhhh =(Itemm) bundle.getSerializable("Itemmm");
        ImageView imh = findViewById(R.id.img1);
        TextView hgg = findViewById(R.id.name1);
        TextView f = findViewById(R.id.artwst);
        TextView d = findViewById(R.id.desic);

        imh.setImageResource(jhhh.getImgg());
        hgg.setText(jhhh.getNamr());
        f.setText(jhhh.getArts());
        d.setText(jhhh.getDess());




    }
}