package Zadanie8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws FileNotFoundException {
        int counter = 0;
        char charA;
        File file = new File("C:\\[SDA]\\Sprawdzian1803\\src\\Zadanie8\\plikTekstowy.txt");
        Scanner scanner = new Scanner(file);

        String fileTekst = scanner.nextLine();

        for (int i = 0 ; i < fileTekst.length() ; i++)
        {
            charA = fileTekst.charAt(i);
            if(charA == '.')
            {
                counter++;
            }
        }
        System.out.println("The File content: " + counter + " sentences.");

    }
}
