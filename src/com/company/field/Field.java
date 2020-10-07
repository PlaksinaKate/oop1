package com.company.field;

import com.company.Player;

import javax.swing.Action;
import java.awt.*;

public class Field implements Comparable<Field> {
    private String name;
    private int numberOfField;

    public Field(String name, int numberOfField) {
        this.name = name;
        this.numberOfField = numberOfField;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfField() {
        return numberOfField;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfField(int numberOfField) {
        this.numberOfField = numberOfField;
    }

    @Override
    public int compareTo(Field field) {
        return this.getNumberOfField() - field.getNumberOfField();
    }
}


