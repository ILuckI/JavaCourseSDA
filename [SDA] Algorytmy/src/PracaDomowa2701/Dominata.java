package PracaDomowa2701;

public class Dominata {

    private static int[] tabT = {1,3,4,6,5,4,2,8,8,8};
    private static int[] tabOfNumbers = {0,1,2,3,4,5,6,7,8,9};
    private static int[] tabL = new int[tabT.length];

    public static void main(String[] args) {

        for (int i = 0; i < tabT.length; i++) {
            for (int j = 0; j <tabOfNumbers.length ; j++) {
                if (tabT[i] == tabOfNumbers[j]){
                    tabL[j]++;
                }
            }
        }
        int max = -1;
        for (int i = 0; i < tabL.length; i++) {
            if(max < tabL[i])
                max = tabL[i];
        }
        System.out.printf("Dominata w tablicy usera znaleziona %d razy.",max);
    }
}


