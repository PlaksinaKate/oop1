package com.company.field;

public class RentPrice {
    private int rentWithoutBuildings, oneHouse, twoHouse, threeHouse, rentWithHotel;

    public RentPrice(int rentWithoutBuildings, int oneHouse, int twoHouse, int threeHouse, int rentWithHotel) {
        this.rentWithoutBuildings = rentWithoutBuildings;
        this.oneHouse = oneHouse;
        this.twoHouse = twoHouse;
        this.threeHouse = threeHouse;
        this.rentWithHotel = rentWithHotel;
    }
}
