package com.teksystems.bootcamp.Entree;

import com.teksystems.bootcamp.Entree.Tortillas.Tortilla;

import java.util.List;

public class VeggieTaco extends Entree{

    public VeggieTaco(Tortilla tortilla, Protein protein, List<Topping> toppings) {
        super(tortilla, protein, toppings);
    }

    public VeggieTaco(Tortilla tortilla) {
       super(tortilla);
    }

    public VeggieTaco(){

    }
}
