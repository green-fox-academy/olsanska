public class SwapElements {
    public static void main(String[] args){
        String[] abc = {"first", "second", "third"};
        String[] temp = {abc[2]};

        abc[2] = abc[0];
        abc[0] = temp[0];

        System.out.println(abc[2]);
        System.out.println(abc[0]);


    }
}

// - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`
