package com.example.artbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Twin extends AppCompatActivity {
    ArrayList<Itemm> arrayList1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twin);
        Itemm p1 = new Itemm("name:non","artist:eric robison","non",R.drawable.dic);
        Itemm p2 = new Itemm("name:non","artist:disiny fine art","non",R.drawable.hfdfrd);
        Itemm p3 = new Itemm("name:non","artist:loish" ,"non",R.drawable.imggggg);
        Itemm p4 = new Itemm("name:BOLD","artist:loish" ,"non",R.drawable.bold);
        Itemm p5 = new Itemm("name:SILENCE","artist:loish" ,"non",R.drawable.silence);
        Itemm p6 = new Itemm("name:NEON","artist:loish" ,"non",R.drawable.neonseries);
        Itemm p7 = new Itemm("name:PUNKS","artist:loish" ,"non",R.drawable.punks);


        arrayList1.add(p1);
        arrayList1.add(p2);
        arrayList1.add(p3);
        arrayList1.add(p4);
        arrayList1.add(p5);
        arrayList1.add(p6);
        arrayList1.add(p7);

        phone arrayAdpterss =  new phone (this,0,arrayList1);
        ListView list = findViewById(R.id.listView12);
        list.setAdapter(arrayAdpterss);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Itemm opo0 = arrayList1.get(i);
                Intent cbb = new Intent(Twin.this,Details.class);
                cbb.putExtra("Itemmm",opo0);
                startActivity(cbb);

            }
    });}
}