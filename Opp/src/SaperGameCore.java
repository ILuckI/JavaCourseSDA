import java.util.Random;

public class SaperGameCore {

    private int[][] _map;
    private int _chanceForBomb;
    private int _xRange;
    private int _yRange;

    public SaperGameCore(int xRange, int yRange, int chanceForBomb) {
        _map = BuildMapWithoutBombs(xRange + 2, yRange + 2);
        _chanceForBomb = chanceForBomb;
        _xRange = xRange;
        _yRange = yRange;

        if (chanceForBomb > 0) {
            Random rnd = new Random();
            for (int i = 1; i < _xRange; i++) {
                for (int j = 1; j < _yRange; j++) {
                    int randomValue = rnd.nextInt(100);
                    if (randomValue <= chanceForBomb) SetBomb(i, j);
                }
            }

        }
    }

    public int[][] giveMeMap() {
        return _map;
    }

    private int[][] BuildMapWithoutBombs(int xRange, int yRange) {
        int[][] map = new int[xRange][yRange];
        for (int i = 1; i < xRange; i++) {
            for (int j = 1; j < yRange; j++) {
                map[i][j] = 0;
            }
        }
        return map;
    }

    public void SetBomb(int posX, int posY) {
        _map[posX][posY] = 100;
        _map[posX - 1][posY - 1] += 1;
        _map[posX - 1][posY] += 1;
        _map[posX - 1][posY + 1] += 1;
        _map[posX][posY - 1] += 1;
        _map[posX][posY + 1] += 1;
        _map[posX + 1][posY - 1] += 1;
        _map[posX + 1][posY] += 1;
        _map[posX + 1][posY + 1] += 1;
    }

}

