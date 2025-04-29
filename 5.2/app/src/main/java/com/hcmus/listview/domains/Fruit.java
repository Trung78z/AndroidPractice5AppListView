package com.hcmus.listview.domains;

public class Fruit {
    private String name;
    private int calories;
    private int imageResource;

    public Fruit(String name, int calories, int imageResource) {
        this.name = name;
        this.calories = calories;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getImageResource() {
        return imageResource;
    }
}
