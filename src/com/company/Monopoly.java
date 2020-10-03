package com.company;

import com.company.field.Action;
import com.company.field.Field;
import com.company.field.RentPrice;
import com.company.field.Street;
import com.company.step.Step;
import com.company.util.CircleList;

import java.awt.*;
import java.util.List;
import java.util.Map;

public class Monopoly {
    private static CircleList<Field> field;
    private static List<Step> st;
    private static Map<Field, List<Player>> fieldState;
    private static Map<Field, Player> fieldAndPlayer;

    public static void addField() {
        field.addLast(new Field("Старт", 1));
        field.addLast(new Street("Старая дорога", 2, Color.ORANGE, 60, 50, 50, new RentPrice(2, 10, 30, 90, 250), null));
        field.addLast(new Action("Казна", 3));
        field.addLast(new Street("Главное шоссе", 4, Color.ORANGE, 60, 50, 50, new RentPrice(4, 20, 60, 180, 450), null));
        field.addLast(new Action("Главное шоссе", 5));
        field.addLast(new Action("Налог с дохода", 6));
        field.addLast(new Action("Налог с дохода", 7));
        field.addLast(new Street("Аквапарк", 8, Color.YELLOW, 100, 50, 50, new RentPrice(6, 30, 90, 270, 550), null));
    }
}
