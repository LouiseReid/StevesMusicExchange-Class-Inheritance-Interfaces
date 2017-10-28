package com.example.louisereid.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("Classical strings", 5, 10);
    }

    @Test
    public void hasDescription(){
        assertEquals("Classical strings", guitarString.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(5, guitarString.getBuyPrice(), 0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(10, guitarString.getSellPrice(), 0.1);
    }

    @Test
    public void markUpCalc(){
        assertEquals(5, guitarString.calcMarkUp(), 0.1);
    }
}
