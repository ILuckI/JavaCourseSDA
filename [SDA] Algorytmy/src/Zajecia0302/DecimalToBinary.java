package Zajecia0302;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Converting numbers from the decimal system to binary");
        System.out.println("Enter number to conversion: ");
        int userNumber = scr.nextInt();
        Stack<Integer> s = new Stack<>();

        while (userNumber > 0) {
            s.push(userNumber % 2);
            userNumber = Math.floorDiv(userNumber, 2);
        }
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}

