import java.util.Scanner;

public class Zadanie1 {
    private static int userAlfa;
    static Scanner scr = new Scanner(System.in);
    private static int beta;
    private static int gamma;

    public static void main(String[] args) {
        userAlfa();
        results();
    }

    public static void userAlfa(){
        System.out.println("Podaj alfe:");
        userAlfa = scr.nextInt();
    }

    public static void results (){
        beta = (90 - userAlfa )/ 2;
        gamma = beta + userAlfa;
        System.out.print("Katy maja miary:" + beta + " i " + gamma);
    }

}
