import java.util.Scanner;

public class weekend3homework6 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int userNumber = scr.nextInt();
        String userString[] = oct(userNumber);
        for (int i = 0; i < userString.length; i++) {
            System.out.print(userString[i] + " ");
            if (userString[i + 1] == null)
                break;
        }

    }

    public static String[] oct(int x) {

        String arrayS[] = new String[100];

        int i = 0;
        while (x > 0) {
            arrayS[i] = String.valueOf(x % 16);


            switch (arrayS[i]) {
                case "10":
                    arrayS[i] = "a";
                    break;
                case "11":
                    arrayS[i] = "b";
                    break;
                case "12":
                    arrayS[i] = "c";
                    break;
                case "13":
                    arrayS[i] = "d";
                    break;
                case "14":
                    arrayS[i] = "e";
                    break;
                case "15":
                    arrayS[i] = "f";
                    break;
                default:
                    break;

            }
            x = Math.floorDiv(x, 16);
            i++;

        }

        return arrayS;
    }
}