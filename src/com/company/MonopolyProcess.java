package com.company;

import com.company.field.*;
import com.company.util.CircleList;

import java.awt.*;
import java.util.ArrayList;

public class MonopolyProcess {

    public void addFields(CircleList<Field> field) {
        field.add(new Field("Старт", 1));
        field.add(new Street("Старая дорога", 2, null, 60, 50, 50, 2, 10, 30, 90, 250, null));
        field.add(new Action("Казна", 3));
        field.add(new Street("Главное шоссе", 4, null, 60, 50, 50, 4, 20, 60, 180, 450, null));
        field.add(new Action("Налог с дохода", 5));
        field.add(new Street("Аквапарк", 6, Color.YELLOW, 100, 50, 50, 6, 30, 90, 270, 550, null));
        field.add(new Action("Шанс", 7));
        field.add(new Street("Городской парк", 8, Color.YELLOW, 100, 50, 50, 6, 30, 90, 270, 550, null));
        field.add(new Street("Горнолыжный курорт", 9, Color.YELLOW, 120, 50, 50, 8, 40, 100, 300, 600, null));
        field.add(new Action("Тюрьма", 10));
        field.add(new Street("Спальный район", 11, Color.GREEN, 140, 100, 100, 10, 50, 150, 450, 750, null));
        field.add(new Street("Деловой квартал ", 12, Color.GREEN, 140, 100, 100, 10, 50, 150, 450, 750, null));
        field.add(new Street("Торговая площадь", 13, Color.GREEN, 160, 100, 100, 12, 60, 180, 500, 900, null));
        field.add(new Street("Компьютеры", 15, Color.PINK, 260, 150, 150, 22, 110, 330, 800, 1150, null));
        field.add(new Street("Интернет", 16, Color.PINK, 260, 150, 150, 22, 110, 330, 800, 1150, null));
        field.add(new Street("Сотовая связь", 17, Color.PINK, 280, 150, 150, 24, 120, 360, 850, 1200, null));
        field.add(new Action("Шанс", 18));
        field.add(new Street("Морские перевозки", 19, Color.BLUE, 300, 200, 200, 26, 130, 390, 900, 1275, null));
        field.add(new Street("Железная дорога", 20, Color.BLUE, 300, 200, 200, 26, 130, 390, 900, 1275, null));
        field.add(new Action("Казна", 21));
        field.add(new Street("Авиакомпания", 22, Color.BLUE, 320, 200, 200, 28, 150, 450, 1000, 1400, null));
        field.add(new Street("Улица Пушкина", 24, Color.CYAN, 180, 100, 100, 14, 70, 200, 550, 950, null));
        field.add(new Action("Казна", 25));
        field.add(new Street("Проспект мира", 26, Color.CYAN, 180, 100, 100, 14, 70, 200, 550, 950, null));
        field.add(new Street("Проспект победы", 27, Color.CYAN, 200, 100, 100, 16, 80, 220, 600, 1000, null));
        field.add(new Action("Бесплатная парковка", 28));
        field.add(new Street("Бар", 29, Color.RED, 220, 150, 150, 18, 90, 250, 700, 1050, null));
        field.add(new Action("Шанс", 30));
        field.add(new Street("Ночной клуб", 31, Color.RED, 220, 150, 150, 18, 90, 250, 700, 1050, null));
        field.add(new Street("Ресторан", 32, Color.RED, 240, 150, 150, 20, 100, 300, 750, 1100, null));
        field.add(new Action("Шанс", 33));
        field.add(new Street("Курортная зона", 34, Color.LIGHT_GRAY, 350, 200, 200, 35, 175, 500, 1100, 1500, null));
        field.add(new Street("Гостиничный комплекс", 35, Color.LIGHT_GRAY, 400, 200, 200, 50, 200, 600, 1400, 2000, null));
    }

    public void addTreasury(CircleList<Treasury> treasury, ArrayList<Player> players) {
        treasury.add(new Treasury("Банковская ошибка в вашу пользу", 200));
        treasury.add(new Treasury("Выгодная продажа акций", 25));
        treasury.add(new Treasury("Освобождение из тюрьмы", 0));
        treasury.add(new Treasury("Вы получили наследство", 100));
        treasury.add(new Treasury("Возмещение налога", 25));
        treasury.add(new Treasury("Вас арестовали", 0));
        treasury.add(new Treasury("Оплата страховки", -50));
        treasury.add(new Treasury("Вы заняли второе место на конкурсе красоты", 10));
        treasury.add(new Treasury("Выгодня продажа облигаций", 50));
        treasury.add(new Treasury("Оплата лечения", 100));
        treasury.add(new Treasury("Сбор ренты", 100));
        treasury.add(new Treasury("С днем рождения!", 10 * (players.size() - 1)));
        treasury.add(new Treasury("Заплатите штраф или возьмите 'Шанс' ", -10));
        treasury.add(new Treasury("Оплата услуг доктора", -50));
    }

    public void addChance(CircleList<Chance> chance) {
        chance.add(new Chance("Отправляйтесь в гостиничный комплекс", 0, 35));
        chance.add(new Chance("Пройдите на старт", 0, 1));
        chance.add(new Chance("Освобождение из тюрьмы", 0, 0));
        chance.add(new Chance("Сбор на ремонт улицы", -100, 0));
        chance.add(new Chance("Отправляйтесь в ресторан", 200, 32));
        chance.add(new Chance("Штраф за превышение скорости", -15, 0));
        chance.add(new Chance("Возврат займа", 150, 0));
        chance.add(new Chance("Капитальный ремонт", -200, 0));
        chance.add(new Chance("Банковские дивиденды", 50, 0));
        chance.add(new Chance("Вождение в нетрезвом виде", -20, 0));
        chance.add(new Chance("Оплата курсов водителей", -150, 0));
        chance.add(new Chance("Вы выиграли чемпионат по шахматам", 100, 0));
        chance.add(new Chance("Отправляйтесь в аквапарк", 200, 6));
        chance.add(new Chance("Отправляйтесь в тюрьму", 0, 10));
    }

    public void addPlayers(ArrayList<Player> players) {
        int numberOfPlayers = 4;
        for (int i = 0; i < numberOfPlayers; i++) {
            Player player = new Player();
            player.setPlayerNumber(i);
            player.setMoney(1500);
            players.add(player);
        }
    }

    public void dice() {
        int firstDice = (int) (Math.random() * 6 + 1);
        int secondDice = (int) (Math.random() * 6 + 1);

        int diceValue = firstDice + secondDice;
        if (firstDice != secondDice) {
            System.out.println("Бросаете кость. Выпало всего: " + diceValue);
        } else {
            System.out.println("У ваших игральных кубиков выпало одиноковое значение! Пожалуйста, бросьте еще раз.");
            firstDice = (int) (Math.random() * 6 + 1);
            secondDice = (int) (Math.random() * 6 + 1);

            diceValue += firstDice + secondDice;
            if (firstDice != secondDice) {
                System.out.println("Вам повезло. Продвиньтесь на такое количество полей вперед: " + diceValue);
            } else {
                System.out.println("Вы должны отправиться в тюрьму ");
            }
        }
    }

    public void movementByChance(Chance chance, Player player) {
        if (chance.getNumberOfFieldWherePlayerNeedToGo() != 0) {
            player.setLocation(chance.getNumberOfFieldWherePlayerNeedToGo());
        }
    }

    public void addMoney(Player player, int money) {
        int playersMoney = player.getMoney() + money;
        player.setMoney(playersMoney);
    }

    public boolean isGameOver(ArrayList<Player> players) {
        int countOfBankrupt = 0;
        Player winner = null;
        for (Player player : players) {
            if (player.getMoney() == 0) {
                countOfBankrupt++;
            } else {
                winner = player;
            }
        }
        if (countOfBankrupt >= (players.size() - 1)) {
            return true;
        }
        return false;
    }


}
