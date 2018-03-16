import java.util.Scanner;

public class ArraySerchException {
    public static void main(String[] args) {

        String[] array = {"1", "2", "3", "4", "5"};

        Scanner scr = new Scanner(System.in);
        String search = scr.next();

        int valuePosition = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(search))
                valuePosition = i;
        }
        if (valuePosition < 0){
            throw new IllegalArgumentException("Nie znaleziono!");
        }
        System.out.println(valuePosition);
    }

}
