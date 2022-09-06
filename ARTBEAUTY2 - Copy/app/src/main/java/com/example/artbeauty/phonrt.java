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

public class phonrt extends ArrayAdapter {
    List<Oh>list47;
    public phonrt(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        list47=objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View vvv = LayoutInflater.from(getContext()).inflate(R.layout.activity_carde2,parent,false);
        Oh itemmNoww =list47.get(position);
        ImageView tv = vvv.findViewById(R.id.imageView6);
        tv.setImageResource(itemmNoww.getImkj());
        return vvv;


}
}
