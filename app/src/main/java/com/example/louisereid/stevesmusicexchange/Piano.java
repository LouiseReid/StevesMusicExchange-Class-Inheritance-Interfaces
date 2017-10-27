package com.example.louisereid.stevesmusicexchange;

/**
 * Created by louisereid on 27/10/2017.
 */

public class Piano extends Instrument implements Playable, Sellable{

    private int keys;
    private int pedals;


    public Piano(String material, String colour, String type, int buyPrice, int sellPrice, int keys, int pedals) {
        super(material, colour, type, buyPrice,sellPrice);
        this.keys = keys;
        this.pedals = pedals;
    }

    public int getKeys() {
        return this.keys;
    }

    public int getPedals() {
        return this.pedals;
    }

    public String play(){
        return "Plink Plank Plonk";
    }
}
