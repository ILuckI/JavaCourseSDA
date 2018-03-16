import java.util.Random;

public class weekend2Homework4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int array[] = new int[10];
        int sort;
        int numbersSum = 0;
        for (int i = 0; i < 10; i++) {
            int numbers = rnd.nextInt(200);
            array[i] = numbers;
            numbersSum += array[i];
        }
        System.out.print("Wylosowane liczby to :");
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %d, ", array[i]);
        }

        do {
            sort = 0;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    sort = 1;
                }
            }
        } while (sort == 1);
        System.out.printf("\nNajmniejsza wartosc: %d \nNajwiekasza wartosc: %d", array[0], array[9]);
        double avarange = (numbersSum / array.length);
        System.out.printf("\nSrednia wartosc: %.2f",avarange);
        int avarangeMax = 0;
        int avarangeMin = 0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i] > avarange)
                avarangeMax++;
            else
                avarangeMin++;
        }
        System.out.printf("\nMniejszych od sredniej: %d\nWiekszych od sredniej: %d",avarangeMin,avarangeMax);
        System.out.printf("\nWyswietlane od konca: ");
        for (int i = array.length-1; i > 0; i--) {
            System.out.printf("%d, ",array[i]);

        }

        }

    }




