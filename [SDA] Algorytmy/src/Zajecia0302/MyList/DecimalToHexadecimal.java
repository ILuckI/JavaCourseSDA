package Zajecia0302.MyList;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Converting numbers from the decimal system to hexadecimal");
        System.out.println("Enter number to conversion: ");
        int userNumber = scr.nextInt();
        Stack<String> s = new Stack<>();

        while (userNumber > 0) {
            int convert = (userNumber % 16);
            if (convert < 10)
                s.push(String.valueOf(convert));
            else if (convert == 10)
                s.push("A");
            else if (convert == 11)
                s.push("B");
            else if (convert == 12)
                s.push("C");
            else if (convert == 13)
                s.push("D");
            else if (convert == 14)
                s.push("E");
            else if (convert == 15)
                s.push("F");

            userNumber = Math.floorDiv(userNumber, 16);
        }
        while (!s.empty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}
