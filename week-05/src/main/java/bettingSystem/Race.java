package bettingSystem;

import java.util.ArrayList;
import java.util.List;

public class Race {
    List<Contestant> contestantList = new ArrayList<>();
    List<Player> playerList = new ArrayList<>();

    public void startRace() {
        List<Integer> placement = new ArrayList<>();

        for (int i = 0; i < contestantList.size() ; i++) {
            placement.add(i + 1);
        }
        for (Contestant cont : contestantList) {
            int num = (int)(Math.random() * placement.size());
            cont.setPlacement(placement.get(num));
            placement.remove(placement.get(num));
        }
        for (int i = 0; i < contestantList.size(); i++) {
            System.out.println(contestantList.get(i));
        }

    }
}