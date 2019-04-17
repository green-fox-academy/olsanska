package PetrolStation;

public class Station {
    int gasAmount;
    public Station(int gasAmount) {
        this.gasAmount = gasAmount;
    }
    public void refill(Car car){
        gasAmount -= car.carCapacity;
        car.gasAmnout = car.carCapacity;

    }

}
