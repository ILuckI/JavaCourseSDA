package Projects.Ships;


public class Game {
    private int sizeOfMap;
    private int[][] map;

    public Game(int sizeOfMap) {
        setSizeOfMap(sizeOfMap);
    }

    // Size of the map ( 10 - 20 )
    public void setSizeOfMap(int sizeOfMap) {
        if (sizeOfMap >= 10 && sizeOfMap <= 20)
            this.sizeOfMap = sizeOfMap;
        else
            System.out.println("Please set map size between 10 and 20!");
    }

    // Build map of 0 ( size x size )
    private int[][] buildMap(int sizeOfMap) {
        int[][] map = new int[sizeOfMap][sizeOfMap];
        for (int i = 1; i < sizeOfMap; i++) {
            for (int j = 1; j < sizeOfMap; j++) {
                map[i][j] = 0;
            }
        }
        return map;
    }

}
