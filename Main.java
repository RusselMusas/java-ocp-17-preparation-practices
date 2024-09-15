
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        byte day = 2;
        System.out.println(day);
        printDayOfWeek(day);
    }

    public static void printDayOfWeek(int day) {
        switch(day) {
            case 1, 2, 3 -> System.out.println("Range between -> Monday - Tuesday - Wednesday");
            case 4, 5, 6 -> System.out.println("Range between -> Thursday - Friday - Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day range");
        }
        System.out.println("Done");
    }
}
