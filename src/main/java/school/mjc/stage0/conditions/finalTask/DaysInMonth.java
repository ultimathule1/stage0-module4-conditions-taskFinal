package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if ((month > 12 || month < 1) || (year < 0)) {
            System.out.println("invalid date");
        } else {
            boolean isLeapYear = false;
            int days = 0;

            if (year % 4 == 0) {
                isLeapYear = true;
                if (year % 100 == 0) {
                    isLeapYear = year % 400 == 0;
                }
            }

            if (isLeapYear && (month == 2)) {
                days++;
            }

            days += switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 28;
                default -> 0;
            };

            System.out.println(days);
        }

    }
}
