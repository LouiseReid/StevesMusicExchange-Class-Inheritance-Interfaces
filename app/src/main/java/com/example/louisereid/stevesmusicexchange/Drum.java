package com.example.louisereid.stevesmusicexchange;

/**
 * Created by louisereid on 27/10/2017.
 */

public class Drum extends Instrument {

    private int drums;
    private int cymbals;

    public Drum(String material, String colour, String type, int buyPrice, int sellPrice, int drums, int cymbals) {
        super(material, colour, type, buyPrice, sellPrice);
        this.drums = drums;
        this.cymbals = cymbals;
    }

    public int getDrums(){
        return this.drums;
    }

    public int getCymbals(){
        return this.cymbals;
    }

    public String play(){
        return "Bang Bang!";
    }



}
