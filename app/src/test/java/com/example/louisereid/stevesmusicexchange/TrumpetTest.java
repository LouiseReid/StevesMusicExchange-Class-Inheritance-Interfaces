package com.example.louisereid.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("brass", "brass", InstrumentTypes.BRASS, 50, 175, 3);
    }

    @Test
    public void hasMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("brass", trumpet.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentTypes.BRASS, trumpet.getType());
    }

    @Test
    public void hasValves(){
        assertEquals(3, trumpet.getValves());
    }


    @Test
    public void canPlay(){
        assertEquals("Toot Toot", trumpet.play());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(50, trumpet.getBuyPrice(), 0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(175, trumpet.getSellPrice(), 0.1);
    }

    @Test
    public void testMarkUpCalc(){
        assertEquals(125, trumpet.calcMarkUp(), 0.1);
    }
}
