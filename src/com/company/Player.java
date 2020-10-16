package com.company;

public class Player {
    private int playerNumber;
    private int money;
    private int location;

    public Player(int playerNumber, int money, int location) {
        this.playerNumber = playerNumber;
        this.money = money;
        this.location = location;
    }

    public Player() {

        this(0, 0,0);
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
}
