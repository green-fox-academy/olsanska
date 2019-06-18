package PetrolStation;

public class Car {
    int gasAmnout;
    int carCapacity;

    public Car(int carCapacity, int gasAmount){
        this.carCapacity = carCapacity;
        this.gasAmnout = gasAmount;
    }

    public Car(){
        this.gasAmnout = 0;
        this.carCapacity = 100;
    }

}
