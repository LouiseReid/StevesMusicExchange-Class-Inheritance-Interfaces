package com.example.louisereid.stevesmusicexchange;


import com.example.louisereid.stevesmusicexchange.Behaviours.Sellable;

import java.util.ArrayList;

/**
 * Created by louisereid on 27/10/2017.
 */

public class Shop {

    ArrayList<Sellable> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public void addToStock(Sellable sellable){
        this.stock.add(sellable);
    }

    public Sellable removeFromStock(){
        return this.stock.remove(0);

    }

    public int totalProfit(){
        int profit = 0;
        for(Sellable sellable : stock){
            profit += sellable.calcMarkUp();
        }
        return profit;
    }

}
