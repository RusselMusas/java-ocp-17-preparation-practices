import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        /** Loops - for-each loop */
        /** Can be used with: 
         *      Built-in java array
         *      Object whose type implements java.lang.iterable (collection) */
        String[] names = {"John", "Jane", "Joe"};
        Main main = new Main();
        main.printNames(names);

        System.out.println("=========================");
        
        List<String> namesList = List.of("Micha", "Owen", "Princilia", "Prunelle");
        main.printNames(namesList);
    }

    public void printNames(String[] names) {
        for (var name : names) 
            System.out.println(name);
    }

    public void printNames(List<String> names) {
        for (var name : names) 
            System.out.println(name);
    }
}
