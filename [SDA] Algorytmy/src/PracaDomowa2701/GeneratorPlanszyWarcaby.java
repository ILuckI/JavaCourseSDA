package PracaDomowa2701;

import java.util.Scanner;

public class GeneratorPlanszyWarcaby {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter board height");
        int userM = Integer.parseInt(scr.nextLine());
        System.out.println("Enter board width");
        int userN = Integer.parseInt(scr.nextLine());
        System.out.println("Enter start color(b or c): ");
        char userStartColor = scr.next().charAt(0);
        char[][] charTab = new char[userM][userN];

        // pull a trigger :)
        mapBuild(charTab, userM, userN, userStartColor);

    }

    public static void mapBuild(char[][] charTab, int userM, int userN, char userStartColor) {
        charTab[0][0] = userStartColor;
        // define a start color
        char userSecond = ' ';
        if (userStartColor == 'b')
            userSecond = 'c';
        else if (userStartColor == 'c')
            userSecond = 'b';
        // build a board
        for (int i = 0; i < userM; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < userN; j++) {
                    if (j % 2 == 0)
                        charTab[i][j] = userStartColor;
                    else
                        charTab[i][j] = userSecond;
                }
            } else {
                for (int j = 0; j < userN; j++) {
                    if (j % 2 != 0)
                        charTab[i][j] = userStartColor;
                    else
                        charTab[i][j] = userSecond;
                }
            }
        }
        // print board
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < userM; i++) {
            sb.append("\n");
            for (int j = 0; j < userN; j++) {
                sb.append(charTab[i][j]).append(", ");
            }
        }
        System.out.println(sb.toString());
    }

}


