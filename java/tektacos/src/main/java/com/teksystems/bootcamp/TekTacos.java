package com.teksystems.bootcamp;

import com.teksystems.bootcamp.BasicTaco.BasicTaco;
import com.teksystems.bootcamp.Entree.Entree;
import com.teksystems.bootcamp.Entree.Tortillas.CornTortilla;
import com.teksystems.bootcamp.Entree.VeggieTaco;

public class TekTacos {
    public static void main( String[] args ) {
        Entree veggieTaco = new VeggieTaco(new CornTortilla().printTortilla());
    }

}
