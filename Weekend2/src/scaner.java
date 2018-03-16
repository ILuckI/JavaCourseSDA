import java.util.Scanner;

public class scaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoja wage (w kilogramach): ");
        double waga = sc.nextDouble();
        System.out.println("Podaj swoj wzrost (w metrach): ");
        double wzrost = sc.nextDouble();
        double bmi = waga / Math.pow(wzrost,2.0);
        System.out.println("Twoje BMI wynosi: " + bmi);
    }
}
