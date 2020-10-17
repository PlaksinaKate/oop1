package com.company.field;

import com.company.Player;

import java.awt.*;

public class Street extends Field {
    private Color color;
    private int price, housePrice, hotelPrice;
    private int rentWithoutBuildings, rentPriceForOneHouse, rentPriceForTwoHouses, rentPriceForThreeHouses, rentWithHotel;
    private Player player;
    private boolean hotelOwned;
    private boolean houseOwned;
    private int amountOfHouses;

    public Street(String name, int numberOfField, Color color, int price, int housePrice, int hotelPrice, int rentWithoutBuildings, int rentPriceForOneHouse, int rentPriceForTwoHouses, int rentPriceForThreeHouses, int rentWithHotel, Player player, boolean hotelOwned, boolean houseOwned, int amountOfHouses) {
        super(name, numberOfField);
        this.color = color;
        this.price = price;
        this.housePrice = housePrice;
        this.hotelPrice = hotelPrice;
        this.rentWithoutBuildings = rentWithoutBuildings;
        this.rentPriceForOneHouse = rentPriceForOneHouse;
        this.rentPriceForTwoHouses = rentPriceForTwoHouses;
        this.rentPriceForThreeHouses = rentPriceForThreeHouses;
        this.rentWithHotel = rentWithHotel;
        this.player = player;
        this.hotelOwned = hotelOwned;
        this.houseOwned = houseOwned;
        this.amountOfHouses = amountOfHouses;
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

    public boolean isHotelOwned() {
        return hotelOwned;
    }

    public boolean isHouseOwned() {
        return houseOwned;
    }

    public int getAmountOfHouses() {
        return amountOfHouses;
    }
}


