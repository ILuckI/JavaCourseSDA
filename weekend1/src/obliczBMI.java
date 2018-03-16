public class obliczBMI {
    public static void main(String[] args) {


        double waga = 124.0;
        double wzrost = 1.64;
        double bmi = waga / Math.pow(wzrost, 2.0);

        if (bmi < 18.5) {
            System.out.print("Twoje BMI wynosi : ");
            System.out.printf("%3.2f", bmi);
            System.out.println(" co oznacza ze masz niedowage!");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.print("Twoje BMI wynosi : ");
            System.out.printf("%3.2f", bmi);
            System.out.println(" co oznacza prawidlowa mase ciala");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.print("Twoje BMI wynosi : ");
            System.out.printf("%3.2f", bmi);
            System.out.println(" co oznacza wage nadwage");
        } else if (bmi >= 30 && bmi <= 34.9) {
            System.out.print("Twoje BMI wynosi : ");
            System.out.printf("%3.2f", bmi);
            System.out.println(" co oznacza lekka nadwage");
        } else if (bmi >= 35 && bmi <= 39.9) {
            System.out.print("Twoje BMI wynosi : ");
            System.out.printf("%3.2f", bmi);
            System.out.println(" co oznacza znaczna nadwage");
        } else {
            System.out.print("Twoje BMI wynosi : ");
            System.out.printf("%3.2f", bmi);
            System.out.println(" co oznacza duza otylosc!!!  ");
        }

    }
}
