public class NumberAdder {
    public static void main(String[] args) {

        System.out.println(FirstRecursion(10));

    }

    public static int FirstRecursion(int n) {
        if (n <= 1){
            return 1;
        } else {
            return n + (FirstRecursion(n - 1));
        }
    }
}

//Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
/*input 10
output
1
2
3
4
5
6
7
8
9
10
*/