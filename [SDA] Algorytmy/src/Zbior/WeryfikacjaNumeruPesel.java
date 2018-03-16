package Zbior;

public class WeryfikacjaNumeruPesel {
    public static void main(String[] args) {

        int[] tab = {0,1,2,3,4,5,6,7,8,9};
        int[] multi = {1,3,7,9,1,3,7,9,1,3,1};
        int[] userPesel = {4,4,8,9,1,0,2,0,1,3,1};
        int cheack=0;

        for (int i = 0; i <userPesel.length ; i++) {
            for (int j = 1; j <tab.length ; j++) {
                if (userPesel[i] == tab[j]){
                    cheack += (j * multi[i]);
                    break;
                }
            }

        }
        if (cheack % 10 == 0) {
            System.out.print("Pesel poprawny");
        } else {
            System.out.println("Bledny pesel");
        }
    }
}
