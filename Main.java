import java.util.Arrays;

public class Main {

    /** Java Core APIs */

    /**
     * @param args
     */
    public static void main(String[] args) {
        /** Arrays */
        int[] numbers = new int[3];
        int numbers2[] = {4, 6, 8};
        System.out.println(numbers.length);
        System.out.println(numbers2.length);

        String []bugs = {"crickets", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs.equals(alias)); //true
        System.out.println(Arrays.toString(bugs));
        System.out.println(Arrays.toString(alias));

        System.out.println("===========================");
        /** sort array */
        int []scores = {8, 2, 6, 5, 0, 9, 10};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        /** Searching in Array */
        System.out.println(Arrays.binarySearch(scores, 2));
        System.out.println(Arrays.binarySearch(scores, 9));
        System.out.println(Arrays.binarySearch(scores, 12));
        System.out.println(Arrays.binarySearch(scores, 4));

        System.out.println("=============================");
        /** Search on unsorted array */
        int[] unsortedScores = {4, 1, 6, 9, 12, 16, 8};
        System.out.println(Arrays.binarySearch(unsortedScores, 4));
        System.out.println(Arrays.binarySearch(unsortedScores, 12));

        System.out.println("===============================");
        /** Comparing arrays */
        System.out.println(Arrays.compare(new int[1], new int[2]));
        System.out.println(Arrays.compare(new char[3], new char[2]));
        System.out.println(Arrays.compare(new String[4], new String[4]));
        System.out.println(Arrays.compare(new boolean[5], new boolean[5]));
        // System.out.println(Arrays.compare(new int[2], new char[2])); // Compiler error -> type mismatch

        /** Arrays with values */
        int [] point01 = new int[] {2, 10, 14};
        int [] point02 = new int[] {2, 11, 14};
        System.out.println(Arrays.compare(point01, point02)); // -1
        System.out.println(Arrays.mismatch(point01, point02)); // 1

        point01[1] = point02[1] = 12;
        System.out.println(Arrays.compare(point01, point02)); // -1
        System.out.println(Arrays.mismatch(point01, point02)); // 1

        System.out.println("============================");
        /** Multiple Dimensional Array */
        int [][]students01 = new int[2][3];
        for(int[] student: students01) {
            for(int item : student)
                System.out.print(item + " ");
            System.out.println();
        }
        System.out.println(students01.length);

        int[] students02, students03[][];
        students02 = new int[3];
        students03 = new int[][][]{{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; // 3D Array
        System.out.println(Arrays.toString(students02));
        System.out.println(students03.length);
        for(int[][] student: students03) {
            for(int[] item : student) {
                for(int el : item)
                    System.out.print(el + " ");
                System.out.println();
            }
            System.out.println();
        }

        /** Array of different sizes */
        int[][] differentSizes = {{1, 4}, {3}, {9,8,7}};
        for(int[] arrayItem: differentSizes) {
            for(int item : arrayItem)
                System.out.print(item + " ");
            System.out.println();
        }
    }

}
