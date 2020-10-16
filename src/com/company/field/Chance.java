package com.company.field;

public class Chance {
    private String text;
    private int money;
    private int numberOfFieldWherePlayerNeedToGo;

    public Chance(String text, int money, int numberOfFieldWherePlayerNeedToGo) {
        this.text = text;
        this.money = money;
        this.numberOfFieldWherePlayerNeedToGo = numberOfFieldWherePlayerNeedToGo;
    }

    public String getText() {
        return text;
    }

    public int getMoney() {
        return money;
    }

    public int getNumberOfFieldWherePlayerNeedToGo() {
        return numberOfFieldWherePlayerNeedToGo;
    }
}
