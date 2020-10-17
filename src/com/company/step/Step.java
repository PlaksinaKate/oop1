package com.company.step;

import com.company.Player;
import com.company.field.Field;

import java.util.List;

public class Step {
    private Field startField, finishField;
    private List<Integer> dice;
    private Action action;
    private Player player;

    public Step(Field startField, Field finishField, List<Integer> dice, Action action, Player player) {
        this.startField = startField;
        this.finishField = finishField;
        this.dice = dice;
        this.action = action;
        this.player = player;
    }
}
