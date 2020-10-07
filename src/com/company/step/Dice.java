package com.company.step;

public class Dice {

    public static void calculateDice() {
        int dice = (int) (Math.random() * 6 + 1 + Math.random() * 6 + 1);
    }
}
