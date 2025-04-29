package com.hcmus.listviewapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.hcmus.listviewapp.R;
import com.hcmus.listviewapp.domains.FoodItem;

import java.util.List;

public class FoodAdapter extends ArrayAdapter<FoodItem> {
    public FoodAdapter(Context context, List<FoodItem> foodItems) {
        super(context, 0, foodItems);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.food_item, parent, false);
        }

        FoodItem currentItem = getItem(position);

        ImageView foodImage = convertView.findViewById(R.id.foodImage);
        TextView foodName = convertView.findViewById(R.id.foodName);
        TextView foodDescription = convertView.findViewById(R.id.foodDescription);
        TextView foodPrice = convertView.findViewById(R.id.foodPrice);

        foodImage.setImageResource(currentItem.getImageResourceId());
        foodName.setText(currentItem.getName());
        foodDescription.setText(currentItem.getDescription());
        foodPrice.setText(String.format("$%.2f", currentItem.getPrice()));

        return convertView;
    }
}