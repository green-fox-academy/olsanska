public class BunniesAgain {
    public static void main(String[] args) {


        System.out.println(Bunnies(33, 2, 3));


    }

    public static int Bunnies(int bunnies, int earsodd, int earseven){
        if (bunnies == 0){
            return 0;
        } else if (bunnies % 2 == 0) {
            return earseven + Bunnies(bunnies - 1, earsodd, earseven);
        } else {
            return earsodd + Bunnies(bunnies - 1, earsodd, earseven);
        }

    }
}

//We have bunnies standing in a line, numbered 1, 2, ...
// The odd bunnies (1, 3, ..) have the normal 2 ears.
// The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
// Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).