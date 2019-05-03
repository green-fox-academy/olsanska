package bettingSystem;

public class Contestant {
    private String name;
    private int placement = 0;

    public Contestant(String name) {
        this.name = name;
        this.placement = placement;
    }

    public void setPlacement(int value) {
        placement = value;
    }

    @Override
    public String toString() {
        return name + " has finished on place: " + placement;
    }
}
