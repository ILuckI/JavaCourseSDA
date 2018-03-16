import java.util.Random;

public class RandomWalkerCore {

    private Boolean[][] _map;
    private int _xRange;
    private int _yRange;

    public RandomWalkerCore(int xRange, int yRange){
        _xRange = xRange;
        _yRange = yRange;
    }

    private Boolean[][] BuildMapOfFalse(int xRange, int yRange) {
        Boolean[][] map = new Boolean[xRange][yRange];
        for (int i = 1; i < xRange; i++) {
            for (int j = 1; j < yRange; j++) {
                map[i][j] = false;
            }
        }
        return map;
    }
    public Boolean[][] giveMeMap() {
        return _map;
    }
}
