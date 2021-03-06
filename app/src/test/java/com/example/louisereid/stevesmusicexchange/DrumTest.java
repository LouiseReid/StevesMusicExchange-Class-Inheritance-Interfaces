package com.example.louisereid.stevesmusicexchange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by louisereid on 27/10/2017.
 */

public class DrumTest {

    Drum drum;

    @Before
    public void before() {
        drum = new Drum("aluminium", "silver", InstrumentTypes.PERCUSSION, 100, 250, 5, 2);
    }

    @Test
    public void hasMaterial(){
        assertEquals("aluminium", drum.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("silver", drum.getColour());
    }

    @Test
    public void hasType(){
        assertEquals(InstrumentTypes.PERCUSSION, drum.getType());
    }

    @Test
    public void hasDrums(){
        assertEquals(5, drum.getDrums());
    }

    @Test
    public void hasCymbals(){
        assertEquals(2, drum.getCymbals());
    }

    @Test
    public void canPlay(){
        assertEquals("Bang Bang!", drum.play());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(100, drum.getBuyPrice(), 0.1);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(250, drum.getSellPrice(), 0.1);
    }

    @Test
    public void testMarkUpCalc(){
        assertEquals(150, drum.calcMarkUp(), 0.1);
    }

    @Test
    public void calcDiscount(){
        drum.calcDiscountedPriceMarkUp(0.15);
        assertEquals(212.5, drum.getSellPrice(), 0.1);
    }

}
