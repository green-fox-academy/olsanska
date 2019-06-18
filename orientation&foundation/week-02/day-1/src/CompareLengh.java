public class CompareLengh {
    public static void main(String[] args){

        int[] p1 = new int[3];
        p1[0] = 1;
        p1[1] = 2;
        p1[2] = 3;
        int[] p2 = new int[2];
        p2[0] = 4;
        p2[1] = 5;

        if (p2.length > p1.length) {
            System.out.println("p2 has more elements than p1");
        } else {
            System.out.println("p1 hasn't more elements than p2");
        }

    }


}

// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`
