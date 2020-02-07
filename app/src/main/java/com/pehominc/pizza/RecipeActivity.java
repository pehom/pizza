package com.pehominc.pizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {
    TextView titleTextView;
    TextView recipeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        titleTextView = findViewById(R.id.titleTextView2);
        recipeTextView = findViewById(R.id.recipeTextView2);

        Intent intent = getIntent();
        if (intent != null) {
            titleTextView.setText(intent.getStringExtra("title"));
            recipeTextView.setText(intent.getStringExtra("recipe"));
        }

    }
}
