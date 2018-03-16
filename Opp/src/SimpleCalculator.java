public class SimpleCalculator {
    public static void main(String[] args) {

        int newArgs = 0;

        for (int i = 0; i < args.length; i++) {
            try {
                newArgs += Integer.parseInt(args[i]);
            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
