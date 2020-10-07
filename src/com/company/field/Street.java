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

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getHousePrice() {
        return housePrice;
    }

    public int getHotelPrice() {
        return hotelPrice;
    }

    public RentPrice getRentPrice() {
        return rentPrice;
    }

    public Player getPlayer() {
        return player;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHousePrice(int housePrice) {
        this.housePrice = housePrice;
    }

    public void setHotelPrice(int hotelPrice) {
        this.hotelPrice = hotelPrice;
    }

    public void setRentPrice(RentPrice rentPrice) {
        this.rentPrice = rentPrice;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}


