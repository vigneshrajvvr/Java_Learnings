package com.java.learn;

public class Main {

    public static void main(String[] args) {

        League<FootballPlayer, Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthron");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago cubs");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();

//        footballLeague.add(baseballTeam);

    }
}
