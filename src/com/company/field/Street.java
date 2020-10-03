package com.company.field;

import com.company.Player;
import com.company.field.Field;

import java.awt.*;

public class Street extends Field {
    private Color color;
    private int price, housePrice, hotelPrice;
    private RentPrice rentPrice;
    private Player player;

    public Street(String name, int numberOfField, Color color, int price, int housePrice, int hotelPrice, RentPrice rentPrice, Player player) {
        super(name, numberOfField);
        this.color = color;
        this.price = price;
        this.housePrice = housePrice;
        this.hotelPrice = hotelPrice;
        this.rentPrice = rentPrice;
        this.player = player;
    }
}

