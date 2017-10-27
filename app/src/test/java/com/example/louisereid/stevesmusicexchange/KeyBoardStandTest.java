package com.example.louisereid.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class KeyBoardStandTest {

    KeyBoardStand keyBoardStand;

    @Before
    public void before(){
        keyBoardStand = new KeyBoardStand("X Frame Stand", 10, 25);
    }

    @Test
    public void hasDescription(){
        assertEquals("X Frame Stand", keyBoardStand.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(10, keyBoardStand.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(25, keyBoardStand.getSellPrice());
    }

    @Test
    public void markUpCalc(){
        assertEquals(15, keyBoardStand.calcMarkUp());
    }


}
