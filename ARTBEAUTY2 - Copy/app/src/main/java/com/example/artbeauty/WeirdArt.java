package com.example.artbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class WeirdArt extends AppCompatActivity {
ArrayList<Oh> arrayList3 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weird_art);
        Oh im1 = new Oh(" artist:Piero Manzoni","name: Artist's Shit","as simple as Piero Manzoni shit in a can",R.drawable.shit);
        Oh im2 = new Oh("artist: Tracey Karima Emin","name:My bed","as simple as that my bed ",R.drawable.mybed);
        Oh im3 = new Oh("artist:robert ryman","name:non","nothing",R.drawable.emty);
        Oh im4 = new Oh("artist:maurizio cattelan","name:Comedian","banana on wall",R.drawable.comidine);
        Oh im5 = new Oh("artist:يزيد الراجحي","name:non","price 3.5mSAR",R.drawable.iuy);



        arrayList3.add(im1);
        arrayList3.add(im2);
        arrayList3.add(im3);
        arrayList3.add(im4);
        arrayList3.add(im5);

        phonrt artsssg = new phonrt(this,0,arrayList3);
        ListView endd =findViewById(R.id.listView123);
        endd.setAdapter(artsssg);
        endd.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Oh gh =arrayList3.get(i);
                Intent intent6 = new Intent(WeirdArt.this,Deital2.class);
                intent6.putExtra("rt",gh);
                startActivity(intent6);
            }
        });

    }
}