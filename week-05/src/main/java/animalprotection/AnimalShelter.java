package animalprotection;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    int budget = 50;
    List<Animal> animalList = new ArrayList<>();
    List<String> adpotersName = new ArrayList<>();

    public int rescue(Animal animal) {
        animalList.add(animal);
        return animalList.size();
    }

    public int heal() {
        for (Animal anim : animalList) {
            if (budget > anim.healCost && !anim.isHealthy) {
                anim.heal();
                return 1;
            }
        }
        return 0;
    }

    public void addAdopter(String name) {
        adpotersName.add(name);
    }

    public void findNewOwner() {
        animalList.remove(animalList.get((int)(Math.random() * animalList.size())));
        adpotersName.remove(adpotersName.get((int)(Math.random() * adpotersName.size())));

    }

    public int earnDonation(int amount) {
        budget += amount;
        return budget;
    }

    @Override
    public String toString() {
        String animalShelterInfo = "Budget: " + budget + "€, There are " + animalList.size() + " animal(s) and " + adpotersName.size() + " potential adopter(s)";
        for (Animal animal : animalList) {
            animalShelterInfo += "\n" + animal.toString();
        }
        return animalShelterInfo;
    }
}
