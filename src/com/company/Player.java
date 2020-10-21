package com.company;

import com.company.field.Field;
import com.company.field.Street;

import java.util.ArrayList;

public class Player {
    private String playerNumber;
    private int money;
    private Field location;
    private ArrayList<Street> allStreets;

    public Player(String playerNumber, int money, Field location, ArrayList<Street> allStreets) {
        this.playerNumber = playerNumber;
        this.money = money;
        this.location = location;
        this.allStreets = allStreets;
    }

    public Player() {

        this(null, 0, null, null);
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setLocation(Field location) {
        this.location = location;
    }

    public ArrayList<Street> getAllStreets() {
        return allStreets;
    }
}
