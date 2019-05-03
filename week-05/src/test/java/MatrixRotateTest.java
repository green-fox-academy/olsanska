import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixRotateTest {

    //test + name of the method _ tested case _ expected result

    @Test
    public void testRotateMatrix_rotation_rotate90degrees() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] expectedMatrix = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}};

        int[][] result = MatrixRotate.rotateMatrix(matrix);
        assertArrayEquals(expectedMatrix[0], result[0]);
        assertArrayEquals(expectedMatrix[1], result[1]);
        assertArrayEquals(expectedMatrix[2], result[2]);
    }

    @Test
    public void testRotateMatrix_emptyArray_emptyArray() {
        int[][] matrix = {};
        int[][] expectedMatrix = {};
        int[][] result = MatrixRotate.rotateMatrix(matrix);

        assertArrayEquals(expectedMatrix, result);

    }
}
