package PracaDomowa2701;

import java.util.Scanner;

public class NajwiekszyWspolnyDzielnik {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.printf("Enter N :");
        int userN = Integer.parseInt(scr.nextLine());
        System.out.printf("Enter K :");
        int userK = Integer.parseInt(scr.nextLine());
        System.out.println(nwd(userN,userK));

    }
    public static int nwd (int userN, int userK){
        if (userK != 0)
            return nwd (userK, userN % userK);
        else
            return userN;
    }
}
