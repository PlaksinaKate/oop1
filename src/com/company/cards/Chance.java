package com.company.cards;

import com.company.field.Field;

public class Chance extends Cards{
    private Field numberOfFieldWherePlayerNeedToGo;

    public Chance(String text, Field numberOfFieldWherePlayerNeedToGo) {
        super(text);
        this.numberOfFieldWherePlayerNeedToGo = numberOfFieldWherePlayerNeedToGo;
    }

    public Field getNumberOfFieldWherePlayerNeedToGo() {
        return numberOfFieldWherePlayerNeedToGo;
    }
}

