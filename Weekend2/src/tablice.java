public class tablice {
    public static void main(String[] args) {

//        int array[] = new int[5];             // pusta tablica 5 elementowa
//        int array[] = {9995,4,36,8,123,};       // przypisane wartosci


//        for (int i=0; i < 5 ; i++) {
//            array[i] = i+1;
//        }
//        System.out.println("");
        int array[] = {9995, 4, 36, 8, 123,};

        for (int i=0; i<array.length; i++){         // wyswietl tablice
            System.out.println(array[i]);
        }
        for (int i=array.length-1; i>= 0; i--){     // wyswietlanie od konca z wart -1 bo tablica jest od 0
            System.out.println(array[i]);
        }

        for (int element : array){
            System.out.println(element);            // petla for each przypisuje tablice i wysietla zmienna element
        }

    }
}
