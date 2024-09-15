
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        byte day = 3;
        System.out.println(day);
        System.out.println(printDayOfWeek(day));
    }

    public static String printDayOfWeek(int day) {
        String result = switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        return result;
    }
}
