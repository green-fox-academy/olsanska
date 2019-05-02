package Pirate;

public class Main {
    public static void main(String[] args) {

        Ship myShip = new Ship();

        myShip.addPirate(new Pirate());
        myShip.addPirate(new Pirate());
        myShip.addPirate(new Pirate());


        myShip.prepareForBattle();
        System.out.println(myShip.getPoorPirates());

    }
}
