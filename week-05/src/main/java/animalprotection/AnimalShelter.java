package animalprotection;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    private int budget = 50;
    private List<Animal> animalList = new ArrayList<>();
    private List<String> adoptersName = new ArrayList<>();

    public int rescue(Animal animal) {
        animalList.add(animal);
        return animalList.size();
    }

    public int heal() {
        for (Animal anim : animalList) {
            if (budget > anim.getHealCost() && !anim.isHealthy()) {
                anim.heal();
                return 1;
            }
        }
        return 0;
    }

    public void addAdopter(String name) {
        adoptersName.add(name);
    }

    public void findNewOwner() {
        animalList.remove(animalList.get((int)(Math.random() * animalList.size())));
        adoptersName.remove(adoptersName.get((int)(Math.random() * adoptersName.size())));

    }

    public int earnDonation(int amount) {
        budget += amount;
        return budget;
    }

    @Override
    public String toString() {
        String animalShelterInfo = "Budget: " + budget + "€, There are " + animalList.size() + " animal(s) and " + adoptersName.size() + " potential adopter(s)";
        for (Animal animal : animalList) {
            animalShelterInfo += "\n" + animal.toString();
        }
        return animalShelterInfo;
    }
}
