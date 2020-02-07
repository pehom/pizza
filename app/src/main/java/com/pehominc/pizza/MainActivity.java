package com.pehominc.pizza;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    GridLayoutManager layoutManager;
    ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
    private int columnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("2196F3")));
        columnCount = getResources().getInteger(R.integer.columnCount);
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza1, Utils.PIZZA1_TITLE, Utils.PIZZA1_DESCRIPTION, Utils.PIZZA1_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza2, Utils.PIZZA2_TITLE, Utils.PIZZA2_DESCRIPTION, Utils.PIZZA2_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza3, Utils.PIZZA3_TITLE, Utils.PIZZA3_DESCRIPTION, Utils.PIZZA3_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza4, Utils.PIZZA4_TITLE, Utils.PIZZA4_DESCRIPTION, Utils.PIZZA4_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza5, Utils.PIZZA5_TITLE, Utils.PIZZA5_DESCRIPTION, Utils.PIZZA5_RECIPE));
       // pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza6, Utils.PIZZA6_TITLE, Utils.PIZZA6_DESCRIPTION, Utils.PIZZA6_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza5, Utils.PIZZA5_TITLE, Utils.PIZZA5_DESCRIPTION, Utils.PIZZA5_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza5, Utils.PIZZA5_TITLE, Utils.PIZZA5_DESCRIPTION, Utils.PIZZA5_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.pizza5, Utils.PIZZA5_TITLE, Utils.PIZZA5_DESCRIPTION, Utils.PIZZA5_RECIPE));


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems, this);
        layoutManager = new GridLayoutManager(this, columnCount);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        //commit after github added
    }
}
