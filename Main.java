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

        StringBuilder d = new StringBuilder(0);
        d.append(2).append(3);
        System.out.println("d= " + d);

        System.out.println("==========================");
        var sb = new StringBuilder("animals");
        sb.insert(7, "-");                  // sb = animals-
        sb.insert(0, "-");                  // sb = -animals-
        sb.insert(4, "-");                  // sb = -ani-mals-
        System.out.println(sb);

        var builder1 = new StringBuilder("pigeon dirty");
        builder1.replace(3, 6, "sty");
        System.out.println(builder1);  // pigsty dirty

        var builder2 = new StringBuilder("pigeon dirty");
        builder2.replace(3, 100, "");
        System.out.println(builder2);
        builder2.reverse();
        System.out.println("builder2 reversed: " + builder2);
    }

}
