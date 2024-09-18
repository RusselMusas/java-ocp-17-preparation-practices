
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
        System.out.println("Char At 6: " + name.charAt(6));
        System.out.println("Char At 7: " + name.charAt(7)); // M
        System.out.println("Char At 15: " + name.charAt(15)); // java.lang.StringIndexOutOfBoundsException
    }

}
