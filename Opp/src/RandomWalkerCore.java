import java.util.Random;

public class RandomWalkerCore {

    private boolean[][] _map;
    private int _xRange;
    private int _yRange;
    private int walkerSteps = 0;

    public RandomWalkerCore(int yRange, int xRange) {
        // Build map of false
        _xRange = xRange;
        _yRange = yRange;
        _map = buildMapOfFalse(xRange, yRange);

        // Random Walker position
        Random rand = new Random();
        int x = rand.nextInt(xRange);
        int y = rand.nextInt(yRange);
        _map[x][y] = true;

        // Let`s play!
        while (!isTripEnd(_map)) {
            walkerSteps++;
            int directions = rand.nextInt(100);

            if (directions <= 25) {
                if (x < _map.length - 1)
                    x++;
            } else if (directions <= 50) {
                if (x > 0)
                    x--;
            } else if (directions <= 75) {
                if (y < _map.length - 1)
                    y++;
            } else if (directions <= 100) {
                if (y > 0)
                    y--;
            }

            if (x < _xRange && x < _yRange && y >= 0 && !_map[x][y]) {
                _map[x][y] = true;
            }
        }

    }

    private boolean[][] buildMapOfFalse(int xRange, int yRange) {
        boolean[][] _map = new boolean[xRange][yRange];
        for (int i = 0; i < xRange; i++) {
            for (int j = 0; j < yRange; j++) {
                _map[i][j] = false;
            }
        }
        return _map;
    }

    private static boolean isTripEnd(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Walker steps: ").append(walkerSteps);
        return sb.toString();
    }
}

