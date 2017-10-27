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

  @Before
    public void before(){
      shop = new Shop();
      guitar = new Guitar("wood", "brown", InstrumentTypes.STRING, 75, 225, 6, "bass");
      piano = new Piano("wood", "black", InstrumentTypes.PERCUSSION, 150, 300, 88, 2);
      drum = new Drum("aluminium", "silver", InstrumentTypes.PERCUSSION, 100, 250, 5, 2);
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
  public void totalProfit(){
    shop.addToStock(guitar);
    shop.addToStock(piano);
    shop.addToStock(drum);
    assertEquals(450, shop.totalProfit());

  }
}
