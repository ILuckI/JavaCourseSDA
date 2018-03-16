public class tablica10int {
    public static void main(String[] args) {
        int array[] = new int[10];

        // ZADANIE 1
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 101;
        }
        for (int element : array) {
            System.out.println(element);
        }


        // ZADANIE 2
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10 + 10;
//            array[i] = (i+1) + 10;        // DRUGA OPCJA

            System.out.println(array[i]);
        }

        // ZADANIE 3
        boolean array2[] = new boolean[20];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (i % 2 == 0);
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("%d:\t%s\n",i,array2[i]);
        }

        // ZADANIE 4
        int array3[] = new int[100];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = i % 10;
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        // ZADANIE 5
        char array10[] = new char[26];
        for (char c = 'a'; c <= 'z'; c++) {
            array10[c - 'a'] = c;
            System.out.println(array10[c - 'a']);
        }


    }
}
