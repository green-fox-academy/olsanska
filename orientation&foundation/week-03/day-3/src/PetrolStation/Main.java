package PetrolStation;

public class Main {
    public static void main(String[] args) {

        Station shell = new Station(500);
        Car myCar = new Car(100, 0);

        System.out.println("Gas amount of my Shell Station: " + shell.gasAmount);

        System.out.println("\nMy car's capacity: " + myCar.carCapacity);
        System.out.println("My car's gas amount: " + myCar.gasAmnout);

        shell.refill(myCar);

        System.out.println("My car's gas amount after refilling: " + myCar.gasAmnout);

        System.out.println("\nGas amount of my Shell Station after my visit: " + shell.gasAmount);

    }

}
