package com.example.artbeauty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
Bundle bundle2 = getIntent().getExtras();

                Item gv = (Item) bundle2.getSerializable("hhg");
        ImageView imhh = findViewById(R.id.img12);
        TextView hggg = findViewById(R.id.name12);
        TextView ff = findViewById(R.id.artwst1);
        TextView dd = findViewById(R.id.desic1);

        imhh.setImageResource(gv.getImggg());
        hggg.setText(gv.getNamrr());
        ff.setText(gv.getArtss());
        dd.setText(gv.getDesss());
    }
}