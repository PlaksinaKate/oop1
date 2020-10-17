package com.company.cards;

public class Chance {
    private String text;
    private int money;
    private int numberOfFieldWherePlayerNeedToGo;

    public Chance(String text, int money, int numberOfFieldWherePlayerNeedToGo) {
        this.text = text;
        this.money = money;
        this.numberOfFieldWherePlayerNeedToGo = numberOfFieldWherePlayerNeedToGo;
    }

    public int getNumberOfFieldWherePlayerNeedToGo() {
        return numberOfFieldWherePlayerNeedToGo;
    }
}
