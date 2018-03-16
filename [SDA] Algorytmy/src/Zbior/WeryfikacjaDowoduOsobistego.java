package Zbior;

public class WeryfikacjaDowoduOsobistego {
    public static void main(String[] args) {

        char[] charsArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] idchar = "ABC555555".toCharArray();
        int[] tab = {7, 3, 1, 9, 7, 3, 1, 7, 3};
        int cheack = 0;

        for (int i = 0; i < idchar.length; i++) {
            for (int j = 0; j < charsArray.length; j++) {
                if (idchar[i] == charsArray[j]) {
                    cheack += (j * tab[i]);
                    break;
                }
            }
        }

        if (cheack % 10 == 0) {
            System.out.print("Id poprawne");
        } else {
            System.out.println("Bledny ID");
        }
    }
}





