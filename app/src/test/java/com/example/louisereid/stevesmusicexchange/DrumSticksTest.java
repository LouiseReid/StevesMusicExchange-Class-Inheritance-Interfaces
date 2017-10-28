package com.example.louisereid.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class DrumSticksTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Wood tips", 6, 15);
    }

    @Test
    public void hasDescription(){
        assertEquals("Wood tips", drumSticks.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(6, drumSticks.getBuyPrice(), 0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(15, drumSticks.getSellPrice(), 0.1);
    }

    @Test
    public void markUpCalc(){
        assertEquals(9, drumSticks.calcMarkUp(), 0.1);
    }

    @Test
    public void discountCalc(){
        drumSticks.calcDiscountedPrice(0.25);
        assertEquals(11.25, drumSticks.getSellPrice(), 0.1);
    }


}
