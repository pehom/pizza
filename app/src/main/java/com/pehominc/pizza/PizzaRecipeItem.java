package com.pehominc.pizza;

public class PizzaRecipeItem {
    private int pizzaImageView;
    private  String title;
    private String description;
    private String recipe;

    public PizzaRecipeItem(int imageResource, String title, String description, String recipe) {
        this.pizzaImageView = imageResource;
        this.title = title;
        this.description = description;
        this.recipe = recipe;
    }

    public int getImageResource() {
        return pizzaImageView;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getRecipe() {
        return recipe;
    }
}
