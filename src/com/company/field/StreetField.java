package com.company.field;

import com.company.Player;
import com.company.field.price.Price;

import java.awt.*;

public class StreetField extends Field {
    private Color color;
    private Player player;
    private Price price;

    public StreetField(String name, int numberOfField, Color color, Player player, Price price) {
        super(name, numberOfField);
        this.color = color;
        this.player = player;
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }
}


