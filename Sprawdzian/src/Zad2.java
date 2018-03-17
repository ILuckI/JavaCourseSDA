import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        ArrayList<Integer> userList = new ArrayList<>();
        // zapisywanie listy
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter nuber :" + (i + 1) + "/10");
            userList.add(scr.nextInt());
        }
        // sprawdzanie poprawnosci danych
        for (Integer arrayList : userList) {
            System.out.println(arrayList);
        }

        // sortowanie
        Collections.sort(userList);

        // min,average, max
        System.out.println("Minimum value is: " + userList.get(1));
        System.out.println("Average value is: " + userList.get(5));
        System.out.println("Maximum value is: " + userList.get(9));

    }
}
