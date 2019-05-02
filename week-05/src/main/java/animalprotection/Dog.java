package animalprotection;

public class Dog extends Animal{
    public Dog(String name) {
        super(name, "Jana", false, (int)(Math.random() * 8) + 1);
    }
    public Dog() {
        this("pejsek");
    }
}
