
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        byte age = 2;
        System.out.println(age);
        System.out.println(printDayOfWeek(age));
    }

    public static String printDayOfWeek(int age) {
        String result = switch(age) {
            case 0, 1, 2, 3 -> {
                if(age == 0) {
                    yield "Baby Lavel 1";
                } else if(age == 1) {
                    yield "Baby Lavel 2";
                } else if(age == 2) {
                    yield "Baby Lavel 3";
                } else {
                    yield "Baby Level 3";
                }
            }
            case 4, 5, 6 -> {yield "Child";}
            case 7, 8, 9, 10, 11, 12 -> "young";
            default -> "Invalid age";
        };
        return result;
    }
}
