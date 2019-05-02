package animalprotection;

public class Animal {

    private String name;
    private String ownerName;
    private boolean isHealthy;
    private int healCost;

    public Animal(String name, String ownerName, boolean isHealthy, int healCost) {
        this.name = name;
        this.ownerName = ownerName;
        this.isHealthy = isHealthy;
        this.healCost = healCost;

    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public int getHealCost() {
        return healCost;
    }

    public void heal() {
        isHealthy = true;
    }

    public boolean isAdoptable() {
        if (isHealthy == true) {
            return true;
        }
        return false;
    }




    @Override
    public String toString() {
        if(isHealthy) {
            return name + " is healthy, and adoptable";
        } else {
            return name + " is not healthy (" + healCost + "€), and not adoptable";
        }
    }
}
