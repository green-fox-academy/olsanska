package Animal;

public class Main {
    public static void main(String[] args) {
        // animalzz

        Animal elephant = new Animal();
        Animal Betty = new Animal();
        Animal dog = new Animal();

        System.out.println(Betty.hunger);
        System.out.println(Betty.thirst);

        Betty.eat();
        Betty.drink();

        System.out.println(Betty.hunger);
        System.out.println(Betty.thirst);

        Betty.play();

        System.out.println(Betty.hunger);
        System.out.println(Betty.thirst);

    }
}
