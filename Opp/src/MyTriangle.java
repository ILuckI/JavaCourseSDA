public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    MyPoint v1 = new MyPoint(x1, y1);
    MyPoint v2 = new MyPoint(x2, y2);
    MyPoint v3 = new MyPoint(x3, y3);

    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("My Triangle[v1=").append(v1.toString()).append(" ,v2=").append(v2.toString()).append(" ,v3=").append(v3.toString()).append("]");
        return sb.toString();
    }

}
