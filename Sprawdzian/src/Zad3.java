import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Zad3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of random numbers: ");
        int randomNumbers = scanner.nextInt();
        int[] generatedNumber = new int[randomNumbers];
        Random random = new Random();
        // generowanie liczb z zakresy -26 -> 26
        for (int i = 0; i < randomNumbers; i++) {
            generatedNumber[i] = random.nextInt(26);
        }
        // Przypisywanie wartosci bezwzglednej
        for (int i = 0; i < randomNumbers; i++) {
            generatedNumber[i] = Math.abs(generatedNumber[i]);
        }
        // tablica z literami alfabetu
        char[] chars = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        HashMap<Character, Integer> numbertTochar = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < randomNumbers; i++) {
            for (int j = 0; j < chars.length - 1; j++) {
                counter++;
                if (generatedNumber[i] == chars[j]) {

                }
            }
        }
        for (int i = 0; i < randomNumbers; i++) {
            System.out.println(generatedNumber[i]);

        }
    }
}
