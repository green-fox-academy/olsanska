package Pirate;
public class Pirate {

    String name = "Brad";
    int amountOfGold = 1;
    int HP = 10;
    boolean hasWoodenLeg = Math.random() < 0.9;
    boolean isCaptain = Math.random() < 0.2;

    public void work(){
        if(isCaptain){
            amountOfGold += 10;
            HP -= 5;
        } else {
            amountOfGold++;
            HP--;
        }
    }

    public void party(){
        if(isCaptain){
            HP += 10;
        } else {
            HP++;
        }
    }


    @Override
    public String toString() {
        if (hasWoodenLeg){
            return "Hello, I'm Jack. I have a wooden leg and " + amountOfGold + " golds.";
        } else {
            return "Hello, I'm Jack. I still have my real legs and " + amountOfGold + " golds.";
        }
    }
}
