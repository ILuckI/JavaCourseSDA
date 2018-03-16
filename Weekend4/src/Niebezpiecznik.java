import java.util.Random;

public class Niebezpiecznik {

    int startYear = 1995;
    int[] daysInStandardYear = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int[] daysInLeapYear = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
       int mean = 0;
        Niebezpiecznik cracker = new Niebezpiecznik();
        for (int i = 0; i < 10000 ; i++) {
            int result = cracker.crackPassword();
            mean += result;
        }
        double exp = mean / 10000.0;
        System.out.println(exp);
    }

    public boolean isLeap(int year) {
        return (((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)));
    }

    public int crackPassword() {
        String password = generateDate();
        int iterator = 0;
        for (int y = 0; y < 2; y++) {
            int currectYear = startYear + y;
            int[] daysInYear = (isLeap(currectYear)) ? daysInLeapYear : daysInStandardYear;

            for (int m = 1; m <= 12; m++) {
                int month = m;
                for (int d = 1; d <= daysInYear[m]; d++) {
                    int day = d;
                   String currentGeneratetPassword = generateString(day,month,currectYear);
                    iterator++;

                    if (currentGeneratetPassword.equals(password)){
                        return iterator;
                    }
                }
            }
        }
        System.out.println("Not fine dude");
        return -1;
    }

    public String generateDate() {
        Random rand = new Random();
        int year = (rand.nextInt(100) < 50) ? 1995 : 1996;
        int[] daysInYear = (isLeap(year)) ? daysInLeapYear : daysInStandardYear;
        int month = rand.nextInt(12) + 1;
        int day = rand.nextInt(daysInYear[month]) + 1;
        return generateString(day, month, year);

    }

    public String generateString(int day, int month, int year) {
        StringBuilder sb = new StringBuilder();
        sb.append(year).append("-");
        if (day < 10) {
            sb.append("0");
        }
        sb.append(day).append("-");
        if (month < 10) {
            sb.append("0");
        }
        sb.append(month).append("-");
        return sb.toString();
    }
}




