package com.company.cards;

public class Chance extends Cards{
    private int numberOfFieldWherePlayerNeedToGo;

    public Chance(String text, int moneyPlus, int moneyMinus) {
        super(text, moneyPlus, moneyMinus);
    }


    public int getNumberOfFieldWherePlayerNeedToGo() {
        return numberOfFieldWherePlayerNeedToGo;
    }
}
