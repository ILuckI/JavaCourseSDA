import java.util.Random;
import java.util.Scanner;

public class weekend3Homework16 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.printf("Podaj liczbe naturalna w przedziale ( 10 - 100 ): ");
        int userN = scr.nextInt();
        Random rnd = new Random();
        int startPositionX = rnd.nextInt(userN);
        int startPositionY = rnd.nextInt(userN);
        int walkerSteps = 0;
        boolean[][] map = new boolean[userN][userN];

        while (isTripEnd(map) == true) {
            walkerSteps++;
            map[startPositionX][startPositionY] = true;

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    int setDirection = rnd.nextInt(100);
                    walkerSteps++;
                    if (setDirection >= 0 && setDirection <= 25)
                        startPositionX++;
                    else if (setDirection >= 26 && setDirection <= 50)
                        startPositionX--;
                    else if (setDirection >= 51 && setDirection >= 75)
                        startPositionY++;
                    else if (setDirection >= 76 && setDirection <= 100)
                        startPositionY--;

                }

            }


        }

        System.out.println(walkerSteps);
    }

    public static boolean isTripEnd(boolean[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (!map[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
