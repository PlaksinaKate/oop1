package com.company;

import com.company.cards.Chance;
import com.company.field.Field;
import com.company.cards.Treasury;
import java.util.LinkedList;
import java.util.Queue;

public class Monopoly {
    private MonopolyProcess monopolyProcess;
    private LinkedList<Field> field;
    private LinkedList<Treasury> treasury;
    private LinkedList<Chance> chance;
    private Queue<Player> players;

    public Monopoly() {
        monopolyProcess = new MonopolyProcess();
        field = new LinkedList<>();
        treasury = new LinkedList<>();
        chance = new LinkedList<>();
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
