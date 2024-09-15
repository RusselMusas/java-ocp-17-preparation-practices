
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        byte day = 3;
        System.out.println(day);
        printDayOfWeek(DayOfWeek.AAAZZZ);
    }

    public static void printDayOfWeek(DayOfWeek day) {
        switch(day) {
            case MONDAY -> System.out.println("Monday");
            case TUESDAY -> System.out.println("Tuesday");
            case WEDNESDAY -> System.out.println("Wednesday");
            case THURSDAY -> System.out.println("Thursday");
            case FRIDAY -> System.out.println("Friday");
            case SATURDAY -> System.out.println("Saturday");
            case SUNDAY -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }
        System.out.println("done");
    }

    enum DayOfWeek { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY, AAAZZZ }
}
