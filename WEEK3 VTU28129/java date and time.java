import java.util.*;

public class Solution {

    public static String findDay(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();

        cal.set(year, month - 1, day);

        String dayOfWeek = "";

        switch (cal.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                dayOfWeek = "SUNDAY";
                break;

            case Calendar.MONDAY:
                dayOfWeek = "MONDAY";
                break;

            case Calendar.TUESDAY:
                dayOfWeek = "TUESDAY";
                break;

            case Calendar.WEDNESDAY:
                dayOfWeek = "WEDNESDAY";
                break;

            case Calendar.THURSDAY:
                dayOfWeek = "THURSDAY";
                break;

            case Calendar.FRIDAY:
                dayOfWeek = "FRIDAY";
                break;

            case Calendar.SATURDAY:
                dayOfWeek = "SATURDAY";
                break;
        }

        return dayOfWeek;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();
        int year = sc.nextInt();

        System.out.println(findDay(month, day, year));
    }
}

OUTPUT:
Input (stdin)
08 05 2015
Your Output (stdout)
WEDNESDAY
Expected Output
WEDNESDAY
