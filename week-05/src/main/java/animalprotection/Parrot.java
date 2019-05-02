package animalprotection;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name, "Betty", true, (int)(Math.random() * 7) + 4);
    }

    public Parrot() {
        this("papoušek");
    }

}
