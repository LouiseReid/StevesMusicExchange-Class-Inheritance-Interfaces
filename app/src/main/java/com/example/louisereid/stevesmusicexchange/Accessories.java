package com.example.louisereid.stevesmusicexchange;

import com.example.louisereid.stevesmusicexchange.Behaviours.Sellable;

/**
 * Created by louisereid on 27/10/2017.
 */

abstract public class Accessories implements Sellable {

    String description;
    int buyPrice;
    int sellPrice;

    public Accessories(String description, int buyPrice, int sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public int calcMarkUp() {
        return this.sellPrice - this.buyPrice;
    }
}
