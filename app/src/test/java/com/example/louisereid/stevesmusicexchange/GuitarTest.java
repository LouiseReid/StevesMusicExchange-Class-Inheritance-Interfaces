package com.example.louisereid.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("wood", "brown", InstrumentTypes.STRING, 75, 225, 6, "bass");
    }

    @Test
    public void hasMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentTypes.STRING, guitar.getType());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void hasKind(){
        assertEquals("bass", guitar.getKind());
    }

    @Test
    public void canPlay(){
        assertEquals("Twing Twang", guitar.play());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(75, guitar.getBuyPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(225, guitar.getSellPrice());
    }

    @Test
    public void testMarkUpCalc(){
        assertEquals(150, guitar.calcMarkUp());
    }
}
