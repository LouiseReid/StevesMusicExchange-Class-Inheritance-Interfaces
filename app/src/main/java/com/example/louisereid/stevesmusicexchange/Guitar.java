package com.example.louisereid.stevesmusicexchange;

import com.example.louisereid.stevesmusicexchange.Behaviours.Playable;
import com.example.louisereid.stevesmusicexchange.Behaviours.Sellable;

/**
 * Created by louisereid on 27/10/2017.
 */

public class Guitar extends Instrument implements Playable, Sellable {

    private int strings;
    private String kind;

    public Guitar(String material, String colour, InstrumentTypes type, int buyPrice, int sellPrice, int strings, String kind) {
        super(material, colour, type, buyPrice, sellPrice);
        this.strings = strings;
        this.kind = kind;
    }

    public int getStrings() {
        return this.strings;
    }

    public String getKind() {
        return this.kind;
    }

    public String play() {
        return "Twing Twang";
    }

}

