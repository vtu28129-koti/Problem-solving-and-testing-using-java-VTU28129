import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        LocalDate date = LocalDate.of(year, month, day);

        String dayName = date.getDayOfWeek().toString();

        return dayName.substring(0, 1)
                + dayName.substring(1).toLowerCase();
    }
}

OUTPUT:
Input
day =
31
month =
8
year =
2019
Output
"Saturday"
