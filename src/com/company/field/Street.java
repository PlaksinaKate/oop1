package com.company.field;

import com.company.field.Field;

import java.awt.*;

public class Street  {
    String name;
    Color color;
    int price, rentPrice, hotelPrice;


    public Street(String name, Color color, int price, int rentPrice, int hotelPrice) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.rentPrice = rentPrice;
        this.hotelPrice = hotelPrice;
    }
}
