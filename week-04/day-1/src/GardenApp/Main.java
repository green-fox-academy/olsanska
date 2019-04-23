package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Garden myGarden = new Garden();
        myGarden.addPlant(new Flower("yellow"));
        myGarden.addPlant(new Flower("blue"));
        myGarden.addPlant(new Tree("orange"));
        myGarden.addPlant(new Tree("purple"));

        myGarden.status();
        System.out.println();
        myGarden.watering(40);
        myGarden.status();
        System.out.println();
        myGarden.watering(70);
        myGarden.status();
    }
}

/* Wanted output:
The yellow Flower needs water
The blue Flower needs water
The purple Tree needs water
The orange Tree needs water

Watering with 40
The yellow Flower doesnt need water
The blue Flower doesnt need water
The purple Tree needs water
The orange Tree needs water

Watering with 70
The yellow Flower doesnt need water
The blue Flower doesnt need water
The purple Tree doesnt need water
The orange Tree doesnt need water
 */