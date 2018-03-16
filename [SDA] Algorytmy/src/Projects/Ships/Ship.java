package Projects.Ships;

public class Ship {
    private int x;
    private int y;
    private int size;
    private String name;

    public Ship() {}

    public Ship(int x, int y, int size, String name) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.name = name;
    }

    // create AircraftCarrier [5]
    public void AircraftCarrier() {
        Ship AircraftCarrier = new Ship(1, 5, 5, "Aircraft carrier");
    }

    // create Battleship [4]
    public void Battleship() {
        Ship Battleship = new Ship(1, 4, 4, "Battleship");
    }

    // create Submarine [3]
    public void Submarine() {
        Ship Submarine = new Ship(1, 3, 3, "Submarine");
    }

    // create Destroyer [2]
    public void Destroyer() {
        Ship Destroyer = new Ship(1, 2, 2, "Destroyer");
    }

    // create Scout [1]
    public void Scout() {
        Ship Scout = new Ship(1, 1, 1, "Scout");
    }

}
