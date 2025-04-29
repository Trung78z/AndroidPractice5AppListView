package com.hcmus.listview.activity;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.hcmus.listview.R;
import com.hcmus.listview.adapter.FruitAdapter;
import com.hcmus.listview.domains.Fruit;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView listView = findViewById(R.id.fruitListView);

        List<Fruit> fruits = new ArrayList<>();
        // Add your fruits with their drawable resources
        for (int i = 0; i < 5; i++) {
            fruits.add(new Fruit("Orange", 47, R.drawable.ic_orange));
            fruits.add(new Fruit("Cherry", 50, R.drawable.ic_cherry));
            fruits.add(new Fruit("Banana", 89, R.drawable.ic_banana));
            fruits.add(new Fruit("Apple", 52, R.drawable.ic_apple));
            fruits.add(new Fruit("Kiwi", 61, R.drawable.ic_kiwi));
            fruits.add(new Fruit("Pear", 57, R.drawable.ic_pear));
        }

        FruitAdapter adapter = new FruitAdapter(this, fruits);
        listView.setAdapter(adapter);
    }
}