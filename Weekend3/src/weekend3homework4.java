import java.util.Scanner;

public class weekend3homework4 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        int userNumber = scr.nextInt();
        String userString[] = bin(userNumber);
        for (int i = 0; i < userString.length ; i++) {
            System.out.print(userString[i] + " ");
            if (userString[i+1] == null)
                break;

        }



    }

    public static String[] bin(int x) {

       String arrayS[] = new String[100];

        int i = 0;
        while (x > 0) {
            arrayS[i] = (x % 2 == 0)? "1": "0";
            x = Math.floorDiv(x, 2);
            i++;
        }

        return arrayS;
    }
}