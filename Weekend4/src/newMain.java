public class newMain {
    public static void main(String[] args) {

        for (int i = args.length - 1; i > 0; i--) {
            System.out.println(args[i]);
        }
        System.out.printf("\n");
        String mString = "";
        for (int i = 0; i < args.length; i++) {
            mString = mString.concat(args[i]);

        }
        System.out.print(mString);

        int x = 10;
        int y = 15;

        System.out.printf("\nx: %d , y: %d", x, y);

        Punkt pk1 = new Punkt();
        Punkt pk2 = new Punkt();





    }

}
