package com.company.step;

import com.company.field.Action;
import com.company.field.Field;

import java.util.List;

public class Step {
    private Field startField, finishField;
    private List<Integer> dice;
    private Action action;

    public Step(Field startField, Field finishField, List<Integer> dice, Action action) {
        this.startField = startField;
        this.finishField = finishField;
        this.dice = dice;
        this.action = action;
    }
}
