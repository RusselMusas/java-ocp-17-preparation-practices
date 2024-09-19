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

        System.out.println("==============================");
        var m = new StringBuilder();
        var n = new StringBuilder();
        var o = m.append("a");
        System.out.println(m == n); // false
        System.out.println(n == o); // false
        System.out.println(m == o); // true
        System.out.println(m.equals(n)); // false
        System.out.println(m.equals(o)); // true
        // System.out.println(m == ""); // Do not compile

        var p = "Hello world";
        var q = getString("Hello world");
        System.out.println(p == q);
        var r = "Hello ";
        r += "world";
        System.out.println(p == r);
    }

    static String getString(String s) {
        return new String(s); // create new String object
        // return new String(s).intern(); // (intern() -> create object in pool if not exist, if object exists in pool, use it
    }
}
