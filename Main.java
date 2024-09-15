
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        byte day = 3;
        System.out.println(day);
        System.out.println(printDayOfWeek(DayOfWeek.MONDAY));
    }

    public static String printDayOfWeek(DayOfWeek day) {
        String result = switch(day) {
            case MONDAY -> "Monday";
            case TUESDAY -> "Tuesday";
            case WEDNESDAY -> "Wednesday";
            case THURSDAY -> "Thursday";
            case FRIDAY -> "Friday";
            case SATURDAY -> "Saturday";
            case SUNDAY -> "Sunday";
        };
        return result;
    }

    enum DayOfWeek { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
}
