import java.util.Scanner;

public class weekend3homework9 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Wpisz cos fajnego ^.^");
        String userS = scr.nextLine();
        char[] userArray = userS.toCharArray();
        int count = 0;

        for (int i = 0; i <userArray.length ; i++) {
            if (userArray[i] == ' ')
                count++;
                    }
        System.out.print(count);

    }
}
