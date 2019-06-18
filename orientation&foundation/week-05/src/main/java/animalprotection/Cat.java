package animalprotection;

public class Cat extends Animal {

    public Cat(String name) {
        super(name, "Roni", true, (int)(Math.random() * 6));
    }

    public Cat() {
        this("Kočička");
    }

}
