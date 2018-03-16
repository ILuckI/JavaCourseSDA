import java.util.Scanner;

public class DateEX {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Podaj datę od której chcesz liczyć w formacie (DD-MM-YYYY)");
        String userStart = scr.next();
        int startDay = Integer.parseInt(userStart.substring(0, 1));
        int startMonth = Integer.parseInt(userStart.substring(3, 5));
        int startYear = Integer.parseInt(userStart.substring(6));

        System.out.println("Podaj datę do której chcesz liczyć w formacie (DD-MM-YYYY)");
        String userEnd = scr.next();
        int endDay = Integer.parseInt(userEnd.substring(0, 1));
        int endMonth = Integer.parseInt(userEnd.substring(3, 5));
        int endYear = Integer.parseInt(userEnd.substring(6));

        int days = 0;

        for (int year = startYear + 1; year < endYear; year++) {
            days += leapyear(year) ? 366 : 365;

        }
        int monthsLengths[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int month = startMonth + 1; month <= 12; month++) {
            days += (month == 2 && leapyear(startYear)) ? days += monthsLengths[month] + 1 : monthsLengths[month];

        }
        days += monthsLengths[startMonth] - startDay;

        for (int month = 1 ; month < endMonth; month++) {
            days += (month == 2 && leapyear(endYear)) ? days += monthsLengths[month] + 1 : monthsLengths[month];

        }
        days += endDay - 5;

        System.out.println(days);
    }

    public static boolean leapyear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
