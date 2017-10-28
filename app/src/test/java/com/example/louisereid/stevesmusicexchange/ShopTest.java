package com.example.louisereid.stevesmusicexchange;

import com.example.louisereid.stevesmusicexchange.Behaviours.Sellable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    Drum drum;
    KeyBoardStand keyBoardStand;

  @Before
    public void before(){
      shop = new Shop();
      guitar = new Guitar("wood", "brown", InstrumentTypes.STRING, 75, 225, 6, "bass");
      piano = new Piano("wood", "black", InstrumentTypes.PERCUSSION, 150, 300, 88, 2);
      drum = new Drum("aluminium", "silver", InstrumentTypes.PERCUSSION, 100, 250, 5, 2);
      keyBoardStand = new KeyBoardStand("X Frame Stand", 10, 25);
  }

  @Test
    public void canAddStock(){
      shop.addToStock(guitar);
      assertEquals(1, shop.getStock().size());
  }

  @Test
  public void canRemoveStock(){
    shop.addToStock(guitar);
    Sellable sellable = shop.removeFromStock();
    assertEquals("wood", guitar.getMaterial());
  }

  @Test
  public void fullPriceProfit(){
    shop.addToStock(guitar);
    shop.addToStock(piano);
    shop.addToStock(drum);
    assertEquals(450, shop.fullPriceProfit(), 0.1);

  }

  @Test
  public void canAddToRefunds(){
    shop.addToRefunds(keyBoardStand);
    assertEquals(1, shop.getRefunds().size());
  }

  @Test
  public void profitAfterRefunds(){
    shop.addToStock(guitar);
    shop.addToStock(piano);
    shop.addToStock(drum);
    shop.addToRefunds(keyBoardStand);
    assertEquals(425, shop.profitAfterRefund(), 0.1);

  }

  @Test
  public void canAddToDiscounts(){
    shop.addToDiscounts(drum);
    assertEquals(1, shop.getDiscounts().size());
  }

  @Test
  public void discountedItemsTotal(){
    drum.calcDiscountedPrice(0.25);
    piano.calcDiscountedPrice(0.25);
    shop.addToDiscounts(drum);
    shop.addToDiscounts(piano);
    assertEquals(412.5, shop.discountedItemsTotal(), 0.1);
  }

  @Test
  public void profitBeforeRefunds(){
    shop.addToStock(piano);
    shop.addToStock(keyBoardStand);
    drum.calcDiscountedPrice(0.25);
    shop.addToDiscounts(drum);
    assertEquals(352.5, shop.profitBeforeRefunds(),0.1);
  }


}
