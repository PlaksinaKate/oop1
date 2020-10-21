package com.company;

import com.company.cards.Chance;
import com.company.cards.Treasury;
import com.company.field.*;
import com.company.field.price.Price;
import com.company.field.price.RentPrice;
import com.company.util.CircleList;

import java.awt.*;
import java.util.*;

public class MonopolyProcess {

    public void addFields(CircleList<Field> field) {
        field.add(new Field("Старт", 1));
        field.add(new StreetField("Старая дорога", 2, null, null, new Price(60, 50, new RentPrice(2, 10, 250))));
        field.add(new ActionField("Казна", 3));
        field.add(new StreetField("Главное шоссе", 4, null, null, new Price(60, 50, new RentPrice(4, 20, 450))));
        field.add(new ActionField("Налог с дохода", 5));
        field.add(new StreetField("Аквапарк", 6, Color.YELLOW, null, new Price(100, 50, new RentPrice(6, 30, 550))));
        field.add(new ActionField("Шанс", 7));
        field.add(new StreetField("Городской парк", 8, Color.YELLOW, null, new Price(100, 50, new RentPrice(6, 30, 550))));
        field.add(new StreetField("Горнолыжный курорт", 9, Color.YELLOW, null, new Price(120, 50, new RentPrice(8, 40, 600))));
        field.add(new ActionField("Тюрьма", 10));
        field.add(new StreetField("Спальный район", 11, Color.GREEN, null, new Price(140, 100, new RentPrice(10, 50, 750))));
        field.add(new StreetField("Деловой квартал ", 12, Color.GREEN, null, new Price(140, 100, new RentPrice(10, 50, 750))));
        field.add(new StreetField("Торговая площадь", 13, Color.GREEN, null, new Price(160, 100, new RentPrice(12, 60, 900))));
        field.add(new StreetField("Компьютеры", 15, Color.PINK, null, new Price(260, 150, new RentPrice(22, 120, 1150))));
        field.add(new StreetField("Интернет", 16, Color.PINK, null, new Price(260, 150, new RentPrice(22, 110, 1150))));
        field.add(new StreetField("Сотовая связь", 17, Color.PINK, null, new Price(280, 150, new RentPrice(24, 120, 1200))));
        field.add(new ActionField("Шанс", 18));
        field.add(new StreetField("Морские перевозки", 19, Color.BLUE, null, new Price(300, 200, new RentPrice(26, 130, 1275))));
        field.add(new StreetField("Железная дорога", 20, Color.BLUE, null, new Price(300, 200, new RentPrice(26, 130, 1275))));
        field.add(new ActionField("Казна", 21));
        field.add(new StreetField("Авиакомпания", 22, Color.BLUE, null, new Price(320, 200, new RentPrice(28, 150, 1400))));
        field.add(new StreetField("Улица Пушкина", 24, Color.CYAN, null, new Price(180, 100, new RentPrice(14, 70, 950))));
        field.add(new ActionField("Казна", 25));
        field.add(new StreetField("Проспект мира", 26, Color.CYAN, null, new Price(180, 100, new RentPrice(14, 70, 950))));
        field.add(new StreetField("Проспект победы", 27, Color.CYAN, null, new Price(200, 100, new RentPrice(16, 80, 1000))));
        field.add(new ActionField("Бесплатная парковка", 28));
        field.add(new StreetField("Бар", 29, Color.RED, null, new Price(220, 150, new RentPrice(18, 90, 1050))));
        field.add(new ActionField("Шанс", 30));
        field.add(new StreetField("Ночной клуб", 31, Color.RED, null, new Price(220, 150, new RentPrice(20, 110, 1070))));
        field.add(new StreetField("Ресторан", 32, Color.RED, null, new Price(240, 150, new RentPrice(22, 120, 1200))));
        field.add(new ActionField("Шанс", 33));
        field.add(new StreetField("Курортная зона", 34, Color.LIGHT_GRAY, null, new Price(350, 200, new RentPrice(35, 175, 1500))));
        field.add(new StreetField("Гостиничный комплекс", 35, Color.LIGHT_GRAY, null, new Price(400, 200, new RentPrice(50, 200, 2000))));
    }

    public void addTreasury(Stack<Treasury> treasury, Queue<Player> players) {
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

    public void addChance(Stack<Chance> chance, CircleList<Field> field) {
        chance.add(new Chance("Отправляйтесь в гостиничный комплекс", searchField("Гостиничный комплекс", field)));
        chance.add(new Chance("Пройдите на старт", searchField("Старт", field)));
        chance.add(new Chance("Освобождение из тюрьмы", null));
        chance.add(new Chance("Отправляйтесь в ресторан", searchField("Ресторан", field)));
        chance.add(new Chance("Отправляйтесь в бар", searchField("Бар", field)));
        chance.add(new Chance("Отправляйтесь в аквапарк", searchField("Аквапарк", field)));
        chance.add(new Chance("Отправляйтесь в тюрьму", searchField("Тюрьма", field)));
    }

    public Field searchField(String nameOfField, CircleList<Field> fields) {
        for (CircleList<Field> it = fields; it.hasNext(); ) {
            Field field = it.next();
            if (field.getName().equals(nameOfField)) {
                return field;
            }
        }
        return null;
    }

    public void addPlayers(Queue<Player> players) {
        int numberOfPlayers = 4;
        ArrayList<String> names = new ArrayList<>();
        names.add("Екатерина");
        names.add("Никита");
        names.add("Макс");
        names.add("Олеся");
        for (int i = 0; i < numberOfPlayers; i++) {
            for (String name : names) {
                Player player = new Player();
                player.setPlayerNumber(name);
                player.setMoney(1500);
                players.add(player);
            }
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
        player.setLocation(chance.getNumberOfFieldWherePlayerNeedToGo());
    }

    public void addMoney(Player player, int money) {
        int playersMoney = player.getMoney() + money;
        player.setMoney(playersMoney);
    }

    public boolean isGameOver(Queue<Player> players) {
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
            endGame(players);
            System.out.println("Победитель:" + winner.getPlayerNumber());
            return true;
        }
        return false;
    }

    public void endGame(Queue<Player> players) {
        int highAmountOfMoney = 0;
        int count = 0;
        Map<Integer, Player> rating = new HashMap<>();
        for (Player player : players) {
//            for (StreetField street : player.getAllStreets()) {
//                if (street.isHotelOwned()) {
//                    addMoney(player, street.getPrice().getPrice() + street.getPrice().getPriceForNewBuildings() * 4);
//                } else if (street.isHouseOwned()) {
//                    addMoney(player, street.getPrice().getPriceForNewBuildings() * amountOfHouses() + street.getPrice().getPrice());
//                } else {
//                    addMoney(player, street.getPrice().getPrice());
//                }
//            }
            if (highAmountOfMoney == player.getMoney()) {
                count++;
                rating.put(count, player);
            } else if (highAmountOfMoney < player.getMoney()) {
                count = 1;
                rating.put(count, player);
                highAmountOfMoney = player.getMoney();
            } else {
                rating.put(rating.size(), player);
            }
        }

        System.out.println("Рейтинг игроков: ");
        for (int i = 0; i < count; i++) {
            System.out.println(rating.get(i - 1).getPlayerNumber());
        }
        System.exit(0);
    }

//    public boolean isHotelOwned(StreetField street) {
//
//    }

    public void addProperty(Map<Player, Field> ownProperty, Player player, Field field) {
        ownProperty.put(player, field);
    }
}
