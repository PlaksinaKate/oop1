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
        field.add(new Street("Старая дорога", 2, null, null, new Price(60,50,new RentPrice(2,10,250))));
        field.add(new ActionField("Казна", 3));
        field.add(new Street("Главное шоссе", 4, null, null,new Price(60,50,new RentPrice(4,20,450))));
        field.add(new ActionField("Налог с дохода", 5));
        field.add(new Street("Аквапарк", 6, Color.YELLOW, null, new Price(100,50,new RentPrice(6,30,550))));
        field.add(new ActionField("Шанс", 7));
        field.add(new Street("Городской парк", 8, Color.YELLOW, null,new Price(100,50,new RentPrice(6,30,550))));
        field.add(new Street("Горнолыжный курорт", 9, Color.YELLOW, null,new Price(120,50,new RentPrice(8,40,600))));
        field.add(new ActionField("Тюрьма", 10));
        field.add(new Street("Спальный район", 11, Color.GREEN, null,new Price(140,100,new RentPrice(10,50,750))));
        field.add(new Street("Деловой квартал ", 12, Color.GREEN,null,new Price(140,100,new RentPrice(10,50,750))));
        field.add(new Street("Торговая площадь", 13, Color.GREEN, null,new Price(160,100,new RentPrice(12,60,900))));
        field.add(new Street("Компьютеры", 15, Color.PINK, null,new Price(260,150,new RentPrice(22,120,1150))));
        field.add(new Street("Интернет", 16, Color.PINK, null, new Price(260,150,new RentPrice(22,110,1150))));
        field.add(new Street("Сотовая связь", 17, Color.PINK, null, new Price(280,150, new RentPrice(24,120,1200))));
        field.add(new ActionField("Шанс", 18));
        field.add(new Street("Морские перевозки", 19, Color.BLUE, null,new Price(300,200,new RentPrice(26,130,1275))));
        field.add(new Street("Железная дорога", 20, Color.BLUE, null,new Price(300,200,new RentPrice(26,130,1275))));
        field.add(new ActionField("Казна", 21));
        field.add(new Street("Авиакомпания", 22, Color.BLUE, null,new Price(320,200,new RentPrice(28,150,1400))));
        field.add(new Street("Улица Пушкина", 24, Color.CYAN, null,new Price(180,100,new RentPrice(14,70,950))));
        field.add(new ActionField("Казна", 25));
        field.add(new Street("Проспект мира", 26, Color.CYAN,  null,new Price(180, 100, new RentPrice(14,70,950))));
        field.add(new Street("Проспект победы", 27, Color.CYAN, null,new Price(200,100, new RentPrice(16,80,1000))));
        field.add(new ActionField("Бесплатная парковка", 28));
        field.add(new Street("Бар", 29, Color.RED, null,new Price(220,150,new RentPrice(18,90,1050))));
        field.add(new ActionField("Шанс", 30));
        field.add(new Street("Ночной клуб", 31, Color.RED, null,new Price(220,150,new RentPrice(20,110,1070))));
        field.add(new Street("Ресторан", 32, Color.RED,null,new Price(240,150,new RentPrice(22,120,1200)) ));
        field.add(new ActionField("Шанс", 33));
        field.add(new Street("Курортная зона", 34, Color.LIGHT_GRAY, null,new Price(350,200,new RentPrice(35,175,1500))));
        field.add(new Street("Гостиничный комплекс", 35, Color.LIGHT_GRAY, null,new Price(400,200,new RentPrice(50,200,2000))));
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

    public void addChance(Stack<Chance> chance,CircleList<Field> field) {
        chance.add(new Chance("Отправляйтесь в гостиничный комплекс", field.));
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
        if (chance.getNumberOfFieldWherePlayerNeedToGo() != 0) {
            player.setLocation(chance.getNumberOfFieldWherePlayerNeedToGo());
        }
    }

    public void addMoney(Player player, int money) {
        int playersMoney = player.getMoney() + money;
        player.setMoney(playersMoney);
    }

//  //  public boolean isGameOver(Queue<Player> players) {
//        int countOfBankrupt = 0;
//        Player winner = null;
//        for (Player player : players) {
//            if (player.getMoney() == 0) {
//                countOfBankrupt++;
//            } else {
//                winner = player;
//            }
//        }
//        if (countOfBankrupt >= (players.size() - 1)) {
//            endGame(players);
//            System.out.println("Победитель:" + winner.getPlayerNumber());
//            return true;
//        }
//        return false;
//    }

//    public void endGame(Queue<Player> players) {
//        int highAmountOfMoney = 0;
//        int count = 0;
//        Map<Integer, Player> rating = new HashMap<>();
//        for (Player player : players) {
//            for (Street street : player.getAllStreets()) {
//                if (street.isHotelOwned()) {
//                    addMoney(player, street.getHotelPrice() + street.getHousePrice() + street.getPrice());
//                } else if (street.isHouseOwned()) {
//                    addMoney(player, street.getHousePrice() * street.getAmountOfHouses() + street.getPrice());
//                } else {
//                    addMoney(player, street.getPrice());
//                }
//            }
//            if (highAmountOfMoney == player.getMoney()) {
//                count++;
//                rating.put(count, player);
//            } else if (highAmountOfMoney < player.getMoney()) {
//                count = 1;
//                rating.put(count, player);
//                highAmountOfMoney = player.getMoney();
//            } else {
//                rating.put(rating.size(), player);
//            }
//        }
//
//        System.out.println("Рейтинг игроков: ");
//        for (int i = 0; i < count; i++) {
//            System.out.println(rating.get(i - 1).getPlayerNumber());
//        }
//        System.exit(0);
//    }


}
