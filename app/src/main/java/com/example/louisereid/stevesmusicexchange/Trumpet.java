package com.example.louisereid.stevesmusicexchange;

/**
 * Created by louisereid on 27/10/2017.
 */

public class Trumpet extends Instrument {

    private int valves;


    public Trumpet(String material, String colour, String type, int buyPrice, int sellPrice, int valves) {
        super(material, colour, type, buyPrice, sellPrice);
        this.valves = valves;
    }

    public int getValves() {
        return valves;
    }

    public String play(){
        return "Toot Toot";
    }
}
