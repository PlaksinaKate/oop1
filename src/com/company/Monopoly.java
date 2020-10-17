package com.company;

import com.company.cards.Chance;
import com.company.field.Field;
import com.company.cards.Treasury;
import com.company.util.CircleList;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Monopoly {
    private MonopolyProcess monopolyProcess;
    private CircleList<Field> field;
    private Stack<Treasury> treasury;
    private Stack<Chance> chance;
    private Queue<Player> players;

    public Monopoly() {
        monopolyProcess = new MonopolyProcess();
        field = new CircleList<>();
        treasury = new Stack<>();
        chance = new Stack<>();
        players = new LinkedList<>();
    }

    public void setUpMonopoly() {
        monopolyProcess.addFields(field);
        monopolyProcess.addTreasury(treasury, players);
        monopolyProcess.addChance(chance);
        monopolyProcess.addPlayers(players);
    }

    public void playMonopoly() {
        while (!monopolyProcess.isGameOver(players)) {
            for (Player player : players) {
                System.out.println("Ход игрока номер: " + player.getPlayerNumber());
                System.out.println(player.toString()); // все свойства игрока


            }
        }
    }

}
