package Zadanie1;

public class demo {


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        char charA;

        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);
        }
        System.out.println(sb);

        for (int i = 0; i < sb.length(); i++) {
            charA = sb.charAt(i);
            if (charA == 'a' || charA == 'A') {
                counter++;
            }
        }

        System.out.println("'A' wsyatapilo : " + counter + " razy!");
    }
}
