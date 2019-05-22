package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
    int ammo;
    int HP;
    int totalDamage;
    List<Aircraft> aircrafts = new ArrayList<>();

    public Carrier(int ammo, int HP) {
        this.ammo = ammo;
        this.HP = HP;

    }

    public void addAircraft(Aircraft aircraft){
        aircrafts.add(aircraft);
    }

    public void fill()  throws Exception  {
        for (Aircraft priority : aircrafts) {
            if (priority.isPriority()) {
                ammo = priority.refill(ammo);
            }
        }
        for (Aircraft aircraft : aircrafts) {

            ammo = aircraft.refill(ammo);
        }

        if (ammo == 0) {
            throw new Exception();
        }
    }

    public void fight(Carrier carrier) {
        for (Aircraft afight : aircrafts ) {
            carrier.HP -= afight.fight();
        }
    }

    public String getStatus() {
        if (HP == 0) {
            return "It's dead Jim :(";
        }
        String status = "HP: " + HP + ", Aircraft count: " + aircrafts.size() + ", Ammo Storage: " + ammo + ", Total damage: " + totalDamage;

        for (Aircraft astatus : aircrafts) {
            status += astatus.getStatus() + "\n";
        }
        return status;
    }

    /*
HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
Aircraft:
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
     */


}
