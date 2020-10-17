package com.company;

import com.company.field.Street;

import java.util.ArrayList;

public class Player {
    private int playerNumber;
    private int money;
    private int location;
    private ArrayList<Street> allStreets;

    public Player(int playerNumber, int money, int location, ArrayList<Street> allStreets) {
        this.playerNumber = playerNumber;
        this.money = money;
        this.location = location;
        this.allStreets = allStreets;
    }


    public Player() {

        this(0, 0, 0, null);
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getMoney() {
        return money;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public ArrayList<Street> getAllStreets() {
        return allStreets;
    }
}
