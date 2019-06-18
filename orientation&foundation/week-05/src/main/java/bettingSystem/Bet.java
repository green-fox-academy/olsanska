package bettingSystem;

public class Bet {
    private int betID;
    private int amount;
    private Player player;
    private Contestant contestant;

    public Bet(int amount, Player player, Contestant contestant) {
        this.betID = (int)(Math.random() * 9000) + 1000;
        this.amount = amount;
        this.player = player;
        this.contestant = contestant;
    }
}

/*
betId - a random number between 1000 - 9999
amount - an integer, it represents the amount of money made on the bet
player - it represents the owner of the bet
contestant - it represents the contestant the bet was made on

 */