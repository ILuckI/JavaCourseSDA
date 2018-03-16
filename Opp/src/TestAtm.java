public class TestAtm {
    public static void main(String[] args) {

        Atm atm1 = new Atm(442231, "ING BANK SLASKI", "Browarna", "23a");
        Atm atm2 = new Atm(442231, "ING BANK SLASKI", "Browarna", "23a", 5000);
        Atm atm3 = new Atm(442231, "ING BANK SLASKI", "Browarna", "23a", 8000, 50000);

        System.out.println(atm1);

        atm2.withdrawMoney(10000);
        System.out.println(atm2);

        atm3.depositCash(50000);
        System.out.println(atm3);

    }
}
