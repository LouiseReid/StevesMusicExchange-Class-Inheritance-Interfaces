package com.example.louisereid.stevesmusicexchange;


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
}
