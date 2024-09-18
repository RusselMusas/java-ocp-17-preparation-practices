public class Main {

    /** Java Core APIs */

    /**
     * @param args
     */
    public static void main(String[] args) {
        /** String methods */
        String name = """
                Russel
                Micha""";
        System.out.println("length: " + name.length());
        System.out.println("Char At 0: " + name.charAt(0)); // R
        System.out.println("Char At 2: " + name.charAt(2)); // s
        System.out.println("Char At 6: " + name.charAt(6)); // line break
        System.out.println("Char At 7: " + name.charAt(7)); // M
        // System.out.println("Char At 15: " + name.charAt(15)); // java.lang.StringIndexOutOfBoundsException
        
        System.out.println("===========================");
        /** Char can be passed to int parameter type */
        printInt('c');
        printInt(50);

        System.out.println("===========================");
        /** indexOf */
        var label = "animalnisime";
        System.out.println("indexOf 'a' is: " + label.indexOf('a'));
        System.out.println("indexOf 'a' from index 1 is: " + label.indexOf('a', 1));
        System.out.println("indexOf 'b' is: " + label.indexOf('b')); // Not found -> -1
        System.out.println("indexOf ma is: " + label.indexOf("ma"));
        System.out.println("indexOf ni is: " + label.indexOf("ni", 3));
        System.out.println("indexOf ni is: " + label.indexOf("ni", 10));
        System.out.println("indexOf ma is: " + label.indexOf("ma"));
        System.out.println("indexOf ma is: " + label.indexOf("merci"));

        System.out.println("===========================");
        /** Substring */
        System.out.println(label.substring(3));
        System.out.println(label.substring(0, 2));
        System.out.println(label.substring(label.length()));
        System.out.println(label.substring(1, 1));
        System.out.println(label.substring(2, 3));
        System.out.println(label.substring(label.length()-1, label.length()));
    }

    public static void printInt(int input) {
        System.out.println(input);
    }

}
