package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> crew = new ArrayList<>();

    public void addPirate(Pirate men){
        if (men.isCaptain) {
            for (Pirate findingCaptain : crew) {
                if(findingCaptain.isCaptain) {
                    return;
                }
            }
        }
        crew.add(men);
    }

    public List<String> getPoorPirates() {
        List<String> names = new ArrayList<>();
        for (Pirate poorPirate : crew) {
            if(poorPirate.hasWoodenLeg && poorPirate.amountOfGold < 15) {
                names.add(poorPirate.name);
            }
        }
        return names;
    }

    public int getGolds() {
        int gold = 0;
        for (Pirate goldsPirate : crew) {
            gold += goldsPirate.amountOfGold;
        }
        return gold;
    }

    public void lastDayOnTheShip() {
        for (Pirate partyPirate : crew) {
            partyPirate.party();
        }
    }

    public void prepareForBattle() {
        for (Pirate battleP : crew) {
            for (int i = 0; i < 5; i++) {
                battleP.work();
            }
        }
        lastDayOnTheShip();
    }
}
