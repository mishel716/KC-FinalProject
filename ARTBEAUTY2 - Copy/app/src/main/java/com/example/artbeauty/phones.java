package com.example.artbeauty;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class phones extends ArrayAdapter {
    List<Item> phom;
    public phones(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        phom=objects;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View vv = LayoutInflater.from(getContext()).inflate(R.layout.activity_main3,parent,false);
        Item bvb = phom.get(position);
        ImageView dd = vv.findViewById(R.id.imageView33);
        dd.setImageResource(bvb.getImggg());
        return vv;
    }
}

