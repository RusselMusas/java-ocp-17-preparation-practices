
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String dayofweek = "Wednesday";
        System.out.println(dayofweek);
        System.out.println(printDayOfWeek(dayofweek));
    }

    public static int printDayOfWeek(String dayofweek) {
        int result = switch(dayofweek) {
            case "Monday" -> { yield 1; }
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> { yield 4; }
            case "Friday" -> { yield 5; }
            case "Saturday" -> { yield 6; }
            case "Sunday" -> 7;
            default -> throw new IllegalArgumentException("Unexpected value: " + dayofweek);
        };
        return result;
    }
}
