package com.example.artbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Oil extends AppCompatActivity {
    ArrayList<Item> arrayList2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oil);
        Item pp2 = new Item("name:Tuhoe","artist:andrew tischler","non",R.drawable.oil);
        Item pp3 = new Item("name:Teal Breaker","artist:andrew tischler","non",R.drawable.ty);
        Item pp4 = new Item("name:wayne","artist:andrew tischler","non",R.drawable.wayne);
        Item pp5 = new Item("name:kimmie","artist:andrew tischler","non",R.drawable.kimmie);
        Item pp6 = new Item("name:Final Flight","artist:andrew tischler","non",R.drawable.finallight);
        Item pp7 = new Item("name:At the Edge of the River","artist:andrew tischler","non",R.drawable.yiu);



        arrayList2.add(pp2);
        arrayList2.add(pp3);
        arrayList2.add(pp4);
        arrayList2.add(pp5);
        arrayList2.add(pp6);
        arrayList2.add(pp7);

        phones arrayAdptersr =  new phones (this,0,arrayList2);
        ListView lisee = findViewById(R.id.listView2);
        lisee.setAdapter(arrayAdptersr);
        lisee.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Item df = arrayList2.get(i);
                Intent g = new Intent(Oil.this,MainActivity2.class);
                g.putExtra("hhg",df);
                startActivity(g);
            }
        });

        };


        }

