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

public class phone extends ArrayAdapter {
    List<Itemm>itemmList;
    public phone(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        itemmList =objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.activity_card,parent,false);
        Itemm itemmNow =itemmList.get(position);
        ImageView y = v.findViewById(R.id.imageView3);
        y.setImageResource(itemmNow.getImgg());
        return v;
    }
}

