package com.hcmus.listview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hcmus.listview.R;
import com.hcmus.listview.domains.Fruit;

import java.util.List;

public class FruitAdapter extends ArrayAdapter<Fruit> {
    public FruitAdapter(Context context, List<Fruit> fruits) {
        super(context, 0, fruits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item_fruit, parent, false);
        }

        ImageView fruitImage = convertView.findViewById(R.id.fruitImage);
        TextView nameView = convertView.findViewById(R.id.fruitName);
        TextView caloriesView = convertView.findViewById(R.id.fruitCalories);

        fruitImage.setImageResource(fruit.getImageResource());
        nameView.setText(fruit.getName());
        caloriesView.setText(fruit.getCalories() + " Calories");

        return convertView;
    }
}
