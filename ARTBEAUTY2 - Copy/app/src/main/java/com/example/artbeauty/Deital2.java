package com.example.artbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Deital2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deital2);
        Bundle bundle5 =getIntent().getExtras();
        Oh ksi = (Oh)bundle5.getSerializable("rt");
        ImageView imj = findViewById(R.id.img14);
        TextView hgj = findViewById(R.id.name14);
        TextView fj = findViewById(R.id.artwst4);
        TextView dj = findViewById(R.id.desic4);

        imj.setImageResource(ksi.getImkj());
        hgj.setText(ksi.getNammm());
        fj.setText(ksi.getArestss());
        dj.setText(ksi.getDiscz());


    }
}
//rt