package Sharpie;

public class Sharpie {
    String color;
    float width;
    float inkAmount = 100;

    public Sharpie(String color, Float width){
        this.color = color;
        this.width = width;
    }

    public void use(){
        inkAmount--;
    }

}
