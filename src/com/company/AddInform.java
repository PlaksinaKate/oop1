package com.company;

import com.company.field.Action;
import com.company.field.Field;
import com.company.field.RentPrice;
import com.company.field.Street;
import com.company.util.CircleList;

import java.awt.*;

public class AddInform {
    private static CircleList<Field> field;

    public static void addField() {
        field.add(new Field("Старт", 1));
        field.add(new Street("Старая дорога", 2, null, 60, 50, 50, new RentPrice(2, 10, 30, 90, 250), null));
        field.add(new Action("Казна", 3));
        field.add(new Street("Главное шоссе", 4, null, 60, 50, 50, new RentPrice(4, 20, 60, 180, 450), null));
        field.add(new Action("Налог с дохода", 5));
        field.add(new Street("Аквапарк", 6, Color.YELLOW, 100, 50, 50, new RentPrice(6, 30, 90, 270, 550), null));
        field.add(new Action("Шанс", 7));
        field.add(new Street("Городской парк", 8, Color.YELLOW, 100, 50, 50, new RentPrice(6, 30, 90, 270, 550), null));
        field.add(new Street("Горнолыжный курорт", 9, Color.YELLOW, 120, 50, 50, new RentPrice(8, 40, 100, 300, 600), null));
        field.add(new Action("Тюрьма",10));
        field.add(new Street("Спальный район", 11, Color.GREEN, 140, 100, 100, new RentPrice(10, 50, 150, 450, 750), null));
        field.add(new Street("Деловой квартал ", 12, Color.GREEN, 140, 100, 100, new RentPrice(10, 50, 150, 450, 750), null));
        field.add(new Street("Торговая площадь", 13, Color.GREEN, 160, 100, 100, new RentPrice(12, 60, 180, 500, 900), null));
        field.add(new Street("Компьютеры", 15, Color.PINK, 260, 150, 150, new RentPrice(22, 110, 330, 800, 1150), null));
        field.add(new Street("Интернет", 16, Color.PINK, 260, 150, 150, new RentPrice(22, 110, 330, 800, 1150), null));
        field.add(new Street("Сотовая связь", 17, Color.PINK, 280, 150, 150, new RentPrice(24, 120, 360, 850, 1200), null));
        field.add(new Action("Шанс", 18));
        field.add(new Street("Морские перевозки", 19,Color.BLUE,300,200,200,new RentPrice(26,130,390,900,1275),null));
        field.add(new Street("Железная дорога", 20,Color.BLUE,300,200,200,new RentPrice(26,130,390,900,1275),null));
        field.add(new Action("Казна", 21));
        field.add(new Street("Авиакомпания", 22,Color.BLUE,320,200,200,new RentPrice(28,150,450,1000,1400),null));
        field.add(new Street("Улица Пушкина", 24, Color.CYAN, 180, 100, 100, new RentPrice(14, 70, 200, 550, 950), null));
        field.add(new Action("Казна", 25));
        field.add(new Street("Проспект мира", 26, Color.CYAN, 180, 100, 100, new RentPrice(14, 70, 200, 550, 950), null));
        field.add(new Street("Проспект победы", 27, Color.CYAN, 200, 100, 100, new RentPrice(16, 80, 220, 600, 1000), null));
        field.add(new Action("Бесплатная парковка", 28));
        field.add(new Street("Бар", 29, Color.RED, 220, 150, 150, new RentPrice(18, 90, 250, 700, 1050), null));
        field.add(new Action("Шанс", 30));
        field.add(new Street("Ночной клуб", 31, Color.RED, 220, 150, 150, new RentPrice(18, 90, 250, 700, 1050), null));
        field.add(new Street("Ресторан", 32, Color.RED, 240, 150, 150, new RentPrice(20, 100, 300, 750, 1100), null));
        field.add(new Action("Шанс", 33));
        field.add(new Street("Курортная зона", 34, Color.LIGHT_GRAY, 350, 200, 200, new RentPrice(35, 175, 500, 1100, 1500), null));
        field.add(new Street("Гостиничный комплекс", 35, Color.LIGHT_GRAY, 400, 200, 200, new RentPrice(50, 200, 600, 1400, 2000), null));

    }
}
