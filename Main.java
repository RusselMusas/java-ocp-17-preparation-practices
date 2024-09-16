import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /** Loops - Nested Loops */
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(matrix);
        System.out.println("=========================");
        printMatrixWithForEachLoop(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    public static void printMatrixWithForEachLoop(int[][] matrix) {
        for(int[] row : matrix) {
            for(int col : row)
                System.out.print(col + " ");
            System.out.println();
        }
    }

}
