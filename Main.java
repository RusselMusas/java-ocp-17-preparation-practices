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

        System.out.println("=========================");
        int sum = 17;
        BAD_IDEA: if(sum > 15)
        EVEN_WORSE_IDEA: {
            sum += 5;
        }
        System.out.println("sum = " + sum);
        System.out.println("=========================");
        int searchValue = 6;
        int[] foundValueCoordinates = findInMatrix(matrix, searchValue);
        if(foundValueCoordinates[0] == -1 && foundValueCoordinates[1] == -1) {
            System.out.println("Value: " + searchValue + " not found in Matrix.");
        } else {
            System.out.println("Value: " + searchValue + " found in Matrix - at " + foundValueCoordinates[0] + "," + foundValueCoordinates[1]);
        }
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

    public static int[] findInMatrix(int[][] matrix, int searchValue) {
        int positionX = -1, positionY = -1;
        PARENT_LOOP: for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        return new int[] {positionX, positionY};
    }

}
