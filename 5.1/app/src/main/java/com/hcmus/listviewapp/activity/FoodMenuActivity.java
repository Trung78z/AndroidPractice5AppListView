package com.hcmus.listviewapp.activity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hcmus.listviewapp.R;
import com.hcmus.listviewapp.adapter.FoodAdapter;
import com.hcmus.listviewapp.domains.FoodItem;

import java.util.ArrayList;
import java.util.List;

public class FoodMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        List<FoodItem> foodItems = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            foodItems.add(new FoodItem("Burger", "Juicy beef burger with cheese", 8.99, R.drawable.burger));
            foodItems.add(new FoodItem("Pizza", "Margherita pizza with fresh basil", 12.99, R.drawable.pizza));
            foodItems.add(new FoodItem("Salad", "Fresh garden salad with vinaigrette", 6.99, R.drawable.salad));
            foodItems.add(new FoodItem("Sushi", "Assorted sushi platter with soy sauce", 14.50, R.drawable.sushi));
            foodItems.add(new FoodItem("Pasta", "Creamy Alfredo pasta with mushrooms", 11.25, R.drawable.pasta));
            foodItems.add(new FoodItem("Tacos", "Spicy chicken tacos with salsa", 9.75, R.drawable.tacos));
            foodItems.add(new FoodItem("Steak", "Grilled steak with mashed potatoes", 18.90, R.drawable.steak));
            foodItems.add(new FoodItem("Sandwich", "Turkey club sandwich with fries", 7.85, R.drawable.sandwich));
            foodItems.add(new FoodItem("Ramen", "Japanese ramen with soft boiled egg", 13.20, R.drawable.ramen));
            foodItems.add(new FoodItem("Ice Cream", "Vanilla ice cream with chocolate syrup", 4.50, R.drawable.ice_cream));        }
        // Add more items

        FoodAdapter adapter = new FoodAdapter(this, foodItems);
        ListView listView = findViewById(R.id.foodListView);
        listView.setAdapter(adapter);

        // Handle item clicks
        listView.setOnItemClickListener((parent, view, position, id) -> {
            FoodItem selectedItem = foodItems.get(position);
            Toast.makeText(this, "Selected: " + selectedItem.getName(), Toast.LENGTH_SHORT).show();
            // You can start a new activity with details here
        });
    }
}
