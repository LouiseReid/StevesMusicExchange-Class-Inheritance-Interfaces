package com.example.louisereid.stevesmusicexchange;

import com.example.louisereid.stevesmusicexchange.Behaviours.Discountable;
import com.example.louisereid.stevesmusicexchange.Behaviours.Refundable;
import com.example.louisereid.stevesmusicexchange.Behaviours.Sellable;

/**
 * Created by louisereid on 27/10/2017.
 */

 abstract public class Accessories implements Sellable, Refundable, Discountable {

    String description;
    double buyPrice;
    double sellPrice;

    public Accessories(String description, double buyPrice, double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    @Override
    public double calcMarkUp() {
        return this.sellPrice - this.buyPrice;
    }

    public double refund(){
        return this.sellPrice;
    }

    public double calcDiscountedPriceMarkUp(double discount){
        return (this.sellPrice -= (this.sellPrice * discount)) - this.buyPrice;

    }

}
