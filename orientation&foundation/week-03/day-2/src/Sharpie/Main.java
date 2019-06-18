package Sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie pen = new Sharpie("black", 10f);

        System.out.println(pen.color + "\n" + pen.width + "\n" + pen.inkAmount);

        pen.use();

        System.out.println(pen.color + "\n" + pen.width + "\n" + pen.inkAmount);


    }
}
