package bettingSystem;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int account;
    private List<Bet> bets = new ArrayList<>();

    public void makeBet(Contestant contestant, int amount) {
        if(account > amount) {
            bets.add(new Bet(amount, this, contestant));
        }
    }

}
