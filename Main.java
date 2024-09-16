import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /** Loops - Adding Optional Labels to Loops, Switch or If-Else */
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printMatrix(matrix);
        System.out.println("=========================");
        printMatrixWithForEachLoop(matrix);

        int sum = 17;
        BAD_IDEA: if(sum > 15)
        EVEN_WORSE_IDEA: {
            sum += 5;
        }
        System.out.println("sum = " + sum);
    }

    public static void printMatrix(int[][] matrix) {
        OUTER_LOOP: for(int i = 0; i < matrix.length; i++) {
            INNER_LOOP: for(int j = 0; j < matrix[i].length; j++) {
                            if(matrix[i][j] == 4)
                                break OUTER_LOOP;
                            System.out.print(matrix[i][j] + " ");
            }
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
