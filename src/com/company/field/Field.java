package com.company.field;

public class Field implements Comparable<Field> {
    private String name;
    private int numberOfField;

    public Field(String name, int numberOfField) {
        this.name = name;
        this.numberOfField = numberOfField;
    }


    public int getNumberOfField() {
        return numberOfField;
    }

    @Override
    public int compareTo(Field field) {
        return this.getNumberOfField() - field.getNumberOfField();
    }
}


