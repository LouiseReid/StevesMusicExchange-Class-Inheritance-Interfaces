package com.example.louisereid.stevesmusicexchange;


import com.example.louisereid.stevesmusicexchange.Behaviours.Discountable;
import com.example.louisereid.stevesmusicexchange.Behaviours.Refundable;
import com.example.louisereid.stevesmusicexchange.Behaviours.Sellable;

import java.util.ArrayList;

/**
 * Created by louisereid on 27/10/2017.
 */

public class Shop {

    ArrayList<Sellable> stock;
    ArrayList<Refundable> refunds;
    ArrayList<Discountable> discounts;

    public Shop() {
        this.stock = new ArrayList<>();
        this.refunds = new ArrayList<>();
        this.discounts = new ArrayList<>();
    }

    public ArrayList<Sellable> getStock() {
        return stock;
    }

    public ArrayList<Refundable> getRefunds() {
        return refunds;
    }

    public ArrayList<Discountable> getDiscounts() {
        return discounts;
    }

    public void addToStock(Sellable sellable){
        this.stock.add(sellable);
    }

    public Sellable removeFromStock(){
        return this.stock.remove(0);

    }

    public double totalProfit(){
        double profit = 0;
        for(Sellable sellable : stock){
            profit += sellable.calcMarkUp();
        }
        return profit;
    }

    public void addToRefunds(Refundable refundable){
        this.refunds.add(refundable);
    }

    public double profitAfterRefund(){
        double totalRefunds = 0;
        for(Refundable refundable : refunds){
            totalRefunds += refundable.refund();
        }
        return totalProfit() - totalRefunds;
    }

    public void addToDiscounts(Discountable discountable){
        this.discounts.add(discountable);
    }


    public double discountedItemsTotal(){
        double discountedTotal = 0;
        for(Discountable discountable : discounts) {
                discountedTotal += discountable.calcDiscountedPrice(0);
            }
        return discountedTotal;
    }



}
