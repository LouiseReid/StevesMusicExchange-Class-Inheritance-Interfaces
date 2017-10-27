package com.example.louisereid.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class PianoTest {
    Piano piano;

    @Before
    public void before() {
        piano = new Piano("wood", "black", "percussion", 150, 300, 88, 2);
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("percussion", piano.getType());
    }

    @Test
    public void hasKeys(){
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void hasPedals(){
        assertEquals(2, piano.getPedals());
    }

    @Test
    public void canPlay(){
        assertEquals("Plink Plank Plonk", piano.play());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(150, piano.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(300, piano.getSellPrice());
    }

    @Test
    public void testMarkUpCalc(){
        assertEquals(150, piano.calcMarkUp());
    }
}
