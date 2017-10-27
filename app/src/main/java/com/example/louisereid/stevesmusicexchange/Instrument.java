package com.example.louisereid.stevesmusicexchange;

/**
 * Created by louisereid on 27/10/2017.
 */

 abstract public class Instrument implements Playable, Sellable {

    String material;
    String colour;
    String type;
    int buyPrice;
    int sellPrice;

    public Instrument(String material, String colour, String type, int buyPrice, int sellPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public String play() {
        return null;
    }


    @Override
    public int calcMarkUp() {
        return this.sellPrice - this.buyPrice;
    }

}