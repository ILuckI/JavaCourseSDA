import java.util.Scanner;

public class weekend3homework10 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Podaj n: ");
        int usern = scr.nextInt();
        String users = String.valueOf(usern);

        String usera = users.concat(users);
        String userb = users.concat(usera);

        int ua = Integer.parseInt(usera);
        int ub = Integer.parseInt(userb);
        int sum = usern + ua + ub;

        System.out.printf("%d + %d + %d = %d",usern,ua,ub,sum);

    }
}
