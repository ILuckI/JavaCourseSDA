import java.util.Scanner;

public class weekend3homework5 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int userNumber = scr.nextInt();
        String userString[] = oct(userNumber);
        for (int i = 0; i < userString.length ; i++) {
            System.out.print(userString[i] + " ");
            if (userString[i+1] == null)
                break;
        }

    }

    public static String[] oct(int x) {

        String arrayS[] = new String[100];

        int i = 0;
        while (x > 0) {
            arrayS[i] = String.valueOf(x%8);
            x = Math.floorDiv(x, 8);
            i++;
        }

        return arrayS;
    }
}