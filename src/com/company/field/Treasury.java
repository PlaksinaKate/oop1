package com.company.field;

public class Treasury {
    private String text;
    private int money;

    public Treasury(String text, Integer money) {
        this.text = text;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public String getText() {
        return text;
    }
}
