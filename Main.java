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

        System.out.println("===========================");
        /** strip and trim */
        String text = "\t \n ab c \n\t";
        System.out.println(text.trim().length());
        System.out.println(text.strip().length());
        System.out.println(text.stripLeading().length());
        System.out.println(text.stripTrailing().length());

        String textBloc = """
                Monsieur le directeur
                Je viens par la presente vous notifier que votre compte a ete cree.
                Cordialement,
                Russel M.""";
        System.out.println(textBloc);
        System.out.println("***************");
        System.out.println(textBloc.indent(4));
        System.out.println(textBloc.indent(4).indent(-2));

        var bloc = """
                a
                 b
                c""";
                    
        System.out.println(bloc.length());
        System.out.println(bloc.indent(1));
        System.out.println(bloc.indent(1).length());

        System.out.println("===========================");
        /** Translate Escape */
        var translate = "129\\t35";
        System.out.println(translate);
        System.out.println(translate.translateEscapes());
        System.out.println(translate.translateEscapes().concat("\r56").concat("\n40"));

        System.out.println("===========================");
        /** isEmpty & isBlank */
        System.out.println(" ".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(" ".isBlank());
        System.out.println("".isBlank());

        System.out.println("===========================");
        /** Formating values */
        var customerName = "Micha";
        var orderId = 541620;

        // Print: Hello Micha, order A541620 is ready.
        System.out.println("Hello " + customerName + ", order " + orderId + " is ready.");
        System.out.println(String.format("Hello %s, order %d is ready.", customerName, orderId));
        System.out.println("Hello %s, order %d is ready.".formatted(customerName, orderId));

        var fullName = "Russel Musasa";
        var score = 90652.25;
        var total = 100000;
        System.out.println("%s:%n   Score: %f out of %d".formatted(fullName, score, total));
        System.out.println("%s:%n   Score: %.2f out of %d".formatted(fullName, score, total)); // limit decimal digits to 2 (%.2f)
        System.out.println("My response is %B".formatted(true));
        System.out.println("My response is %b".formatted(false));
        System.out.println(String.format("%s:%n   Score: %,.2f out of %d", fullName, score, total));
        System.out.format("[%12.2f]", 820.12); System.out.println();
        System.out.format("[%012.2f]", 820.12); System.out.println();
        System.out.format("[%012.3f]", 820.12);
    }

    public static void printInt(int input) {
        System.out.println(input);
    }

}
