import java.util.Arrays;

public class Main {

    /** Java Core APIs */

    /**
     * @param args
     */
    public static void main(String[] args) {
        /** Math APIs */
        /** Min and Max */
        int maximum = Math.max(3, 7);   // 7
        int minimum = Math.min(7, -9); // -9
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(Math.min(2, 2));
        System.out.println(Math.max(5, 5));

        /** Rounding numbers */
        long low = Math.round(123.45);       // 123
        long high = Math.round(123.50);      // 124
        int fromFloat = Math.round(123.45f); // 123
        System.out.println("Rounding low: " + low);
        System.out.println("Rounding high: " + high);
        System.out.println("Rounding fromFloat: " + fromFloat);

        System.out.println("============================");
        /** Ceiling and Floor */
        double myDouble01 = 3.18;
        double myDouble02 = -3.25;
        System.out.println(Math.ceil(myDouble01));
        System.out.println(Math.floor(myDouble01));
        System.out.println(Math.abs(myDouble01));
        System.out.println(Math.ceil(myDouble02));
        System.out.println(Math.floor(myDouble02));
        System.out.println(Math.abs(myDouble02));

        /** Exponent */
        int base = 5;
        int exp = 2;
        System.out.println(Math.pow(base, exp));

        /** Random */
        double rnum = Math.random();
        System.out.println(rnum);
    }

}
