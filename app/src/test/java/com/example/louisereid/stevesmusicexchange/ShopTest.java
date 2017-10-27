package com.example.louisereid.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class ShopTest {

    Shop shop;
    Guitar guitar;

  @Before
    public void before(){
      shop = new Shop();
      guitar = new Guitar("wood", "brown", "string", 75, 225, 6, "bass");
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
}
