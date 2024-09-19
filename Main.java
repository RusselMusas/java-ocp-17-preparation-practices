public class Main {

    /** Java Core APIs */

    /**
     * @param args
     */
    public static void main(String[] args) {
        /** StringBuilder class */
        StringBuilder alphabet = new StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            alphabet.append(current);
        System.out.println("Alphabet is: " + alphabet);

        System.out.println("========================");
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("d").append("e");
        b = b.append("f").append("g");
        a.append("h").append("i");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        StringBuilder c = a;
        c.append("j").append("k");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        System.out.println("b= " + b);
    }

}
