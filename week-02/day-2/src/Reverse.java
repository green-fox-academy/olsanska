public class Reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";


            int i;
            int len = reversed.length();
            StringBuilder dest = new StringBuilder(len);

            for (i = (len - 1); i >= 0; i--){
                dest.append(reversed.charAt(i));
            }

           // return dest.toString();
        System.out.println(dest.toString());


        //System.out.println(reverse(reversed));
    }
}

// Create a method that can reverse a String, which is passed as the parameter
// Use it on this reversed string to check it!
// Try to solve this using charAt() first, and optionally anything else after.
