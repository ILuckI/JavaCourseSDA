package Zadanie3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class demo {
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        ArrayList<Integer> randomNumbers = new ArrayList<>();

        System.out.println("Podaj ilosc losowanych liczb: ");
        int userNumbers = scanner.nextInt();

        for (int i = 0; i < userNumbers; i++) {
            randomNumbers.add(random(-100, 100));
        }

        for (Integer arrayList : randomNumbers) {
            System.out.println(arrayList);
        }

        Collections.sort(randomNumbers);
        System.out.println("Minimum value is: " + randomNumbers.get(0));
        System.out.println("Maximum value is: " + randomNumbers.get(userNumbers - 1));
        System.out.println("Difference between min and max is : " + (randomNumbers.get(userNumbers - 1) - randomNumbers.get(0)));

    }

    public static void setRandom() {

    }

    public static int random(int min, int max) {
        return random.nextInt(max + 1 - min) + min;
    }

}

