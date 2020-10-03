package com.company.field;

public class RentPrice {
    private int rentWithoutBuildings, oneHouse, twoHouses, threeHouses, rentWithHotel;

    public RentPrice(int rentWithoutBuildings, int oneHouse, int twoHouses, int threeHouses, int rentWithHotel) {
        this.rentWithoutBuildings = rentWithoutBuildings;
        this.oneHouse = oneHouse;
        this.twoHouses = twoHouses;
        this.threeHouses = threeHouses;
        this.rentWithHotel = rentWithHotel;
    }
}
