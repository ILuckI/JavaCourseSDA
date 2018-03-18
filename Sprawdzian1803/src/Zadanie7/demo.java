package Zadanie7;

public class demo {
    public static void main(String[] args) {

        System.out.println( rev("Testing"));

    }
    public static String rev(String str) {
        if ((null == str) || (str.length() <= 1)) {
            return str;
        }
        return rev(str.substring(1)) + str.charAt(0);
    }
}
