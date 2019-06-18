package com.gfa.foxapp.models;

import java.util.List;

public class Fox {

    public String name;
    public String food;
    public String drink;
    public List<String> trick;

    public Fox(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public List<String> getTrick() {
        return trick;
    }

    public void setTrick(List<String> trick) {
        this.trick = trick;
    }
}
