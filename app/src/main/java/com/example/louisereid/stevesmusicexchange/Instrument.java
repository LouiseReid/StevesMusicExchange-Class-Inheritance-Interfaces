package com.example.louisereid.stevesmusicexchange;

import com.example.louisereid.stevesmusicexchange.Behaviours.Discountable;
import com.example.louisereid.stevesmusicexchange.Behaviours.Playable;
import com.example.louisereid.stevesmusicexchange.Behaviours.Sellable;

/**
 * Created by louisereid on 27/10/2017.
 */

 abstract public class Instrument implements Playable, Sellable, Discountable {

    String material;
    String colour;
    InstrumentTypes type;
    double buyPrice;
    double sellPrice;

    public Instrument(String material, String colour, InstrumentTypes type, double buyPrice, double sellPrice) {
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

    public InstrumentTypes getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public String play() {
        return null;
    }


    @Override
    public double calcMarkUp() {
        return this.sellPrice - this.buyPrice;
    }

    @Override
    public double calcDiscountedPrice(double discount) {
        return this.sellPrice -= (this.sellPrice * discount);
    }

}
