public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXY() {
        int[][] array = new int[x][y];
        return array[x][y];
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(").append(x).append(",").append(y).append(")");
        return sb.toString();
    }

    public MyPoint distance(int x, int y) {
        MyPoint dist = new MyPoint(x, y);
        dist.x = Math.abs(x - this.x);
        dist.y = Math.abs(y - this.y);
        return dist;
    }

    public MyPoint anotherDistance(MyPoint another) {
        MyPoint between = new MyPoint();
        between.x = Math.abs(another.x - this.x);
        between.y = Math.abs(another.y - this.y);
        return between;

    }

    public MyPoint to00() {
        MyPoint to0 = new MyPoint();
        to0.x = Math.abs(0 + this.x);
        to0.y = Math.abs(0 + this.y);
        return to0;
    }


}
