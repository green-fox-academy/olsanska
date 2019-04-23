package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    List<Plant> plants = new ArrayList<>();

    Flower yellow = new Flower("yellow");

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void watering(double amount) {
        int thirstyKytky = 0;
        for (Plant thirstyPlants : plants) {
            if (thirstyPlants.isThirsty()) {
                thirstyKytky++;
            }
        }
        for (Plant plantsToWater : plants ) {
            if (plantsToWater.isThirsty()) {
                plantsToWater.water(amount / thirstyKytky);
            }
        }
    }

    public void status() {
        for (Plant p : plants)
            System.out.println(p);
    }
}
