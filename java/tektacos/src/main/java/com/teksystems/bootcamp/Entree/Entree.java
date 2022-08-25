package com.teksystems.bootcamp.Entree;

import com.teksystems.bootcamp.Entree.Tortillas.Tortilla;

import java.util.List;

public abstract class Entree {
    Tortilla tortilla;

    Protein protein;

    List<Topping> toppings;

    public Entree(Tortilla tortilla, Protein protein, List<Topping> toppings) {
        this.tortilla = tortilla;
        this.protein = protein;
        this.toppings = toppings;
    }

    public Entree(Tortilla tortilla) {
        this.tortilla = tortilla;
    }

    public Entree(){

    }
}
