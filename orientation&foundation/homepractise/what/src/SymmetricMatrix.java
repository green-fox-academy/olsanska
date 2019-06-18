public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {2,3,4},
                {8,4,5}
        };


        System.out.println(isSymmetric(a));
    }

    public static boolean isSymmetric(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (matrix[row][column] != matrix[column][row]){
                    return false;
                }
            }
        }
        return true;
    }
}
