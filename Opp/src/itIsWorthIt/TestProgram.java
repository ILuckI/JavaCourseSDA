package itIsWorthIt;

public class TestProgram {
    public static void main(String[] args) {

        Cars dieselCar = new Diesel("Octavia 2.0 TDI 140KM", 25000, 6.5);
        Cars petrolCar = new Petrol("Octavia 2.0 FSI 150KM", 22000, 8.5);
        Cars gasCar = new Gas("Octavia 2.0 FSI 150KM + LPG", 22000, 9.5, 2000);

        System.out.println(dieselCar.oneYearComapre(dieselCar,petrolCar,gasCar));
        System.out.println(dieselCar.threeYearComapre(dieselCar,petrolCar,gasCar));
        System.out.println(dieselCar.totalComapre(dieselCar,petrolCar,gasCar));
        System.out.println(dieselCar.worstCaseScenario(dieselCar,petrolCar,gasCar));

    }
}
