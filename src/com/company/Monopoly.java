package com.company;

import com.company.field.Chance;
import com.company.field.Field;
import com.company.field.Treasury;
import com.company.util.CircleList;

import java.util.ArrayList;

public class Monopoly {
    private MonopolyProcess monopolyProcess;
    private CircleList<Field> field;
    private CircleList<Treasury> treasury;
    private CircleList<Chance> chance;
    private ArrayList<Player> players;

    public Monopoly() {
        monopolyProcess = new MonopolyProcess();
        field = new CircleList<>();
        treasury = new CircleList<>();
        chance = new CircleList<>();
        players = new ArrayList<>();
    }

    public void setUpMonopoly() {
        monopolyProcess.addFields(field);
        monopolyProcess.addTreasury(treasury, players);
        monopolyProcess.addChance(chance);
        monopolyProcess.addPlayers(players);
    }

    public void playMonopoly() {
        while (monopolyProcess.isGameOver(players)) {

        }
    }

}
