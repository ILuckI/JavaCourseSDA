package Zbior;

public class SpacjeCamelCaseOdwrotnosc {
    public static void main(String[] args) {

        char[] chars = "HalloJestTuKtos".toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i]) && i != 0){
                System.out.print(" " + Character.toLowerCase(chars[i]));
            }
            else
            System.out.print(chars[i]);
        }
    }
}
