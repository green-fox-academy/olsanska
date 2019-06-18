public class bunnies {
    public static void main(String[] args) {


        System.out.println(Bunnies(33, 2));


    }

    public static int Bunnies(int bunnies, int ears){
        if (bunnies == 0){
            return 0;
        } else {
            return ears + Bunnies(bunnies - 1, ears);
        }

    }


}

/*
We have a number of bunnies and each bunny has two big floppy ears.
We want to compute the total number of ears across all the bunnies recursively
 */