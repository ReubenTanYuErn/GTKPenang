package com.a202sgi.android.gtkpenang;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.button;

public class List extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] list;
    private final Integer[] icons;
    public List(Activity context,
                String[] list, Integer[] icons) {
        super(context, R.layout.list_category,list);
        this.context = context;
        this.list = list;
        this.icons = icons;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.list_category, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtTitle.setText(list[position]);

        imageView.setImageResource(icons[position]);

        return rowView;
    }


}

