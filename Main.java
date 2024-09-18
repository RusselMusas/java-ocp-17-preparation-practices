
public class Main {

    /** Java Core APIs */

    /**
     * @param args
     */
    public static void main(String[] args) {
        String name = """
                Russel
                Micha""";
        System.out.println("name: \n" + name);
        System.out.println("=========");
        int a = 5;
        System.out.println("6" + 5);
        System.out.println(a + 6);
        System.out.println(a + "6");
        System.out.println("""
                           Marlene
                           """ + name);
        System.out.println(a + 2 + 6 + "6"); // 136
        System.out.println("6" + a + 2 + 6); // 6526
        System.out.println("6" + (a + 2 + 6)); // 613
        System.out.println("null" + null);
        System.out.println("azerty" + null);
    }

}
