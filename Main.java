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
        int []scores = {8, 2, 6};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));

        String[] strings = { "10", "9", "100" };
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        System.out.println("===========================");
        /** Reminder on some exercices on Strings */
        var greeting01 = "Hello world";
        var greeting02 = "Hello ";
        greeting02 += "world";
        var greeting03 = greeting02;
        System.out.println(greeting01 == greeting02);
        System.out.println(greeting01 == greeting03);
    }

}
