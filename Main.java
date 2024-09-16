
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
    }

    public void printNames(String[] names) {
        for (String name : names) 
            System.out.println(name);
    }
}
