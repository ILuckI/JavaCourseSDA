public class MyCircle {
    private MyPoint center = new MyPoint();
    private int radius;

    public MyCircle(){
        center.setX(0);
        center.setY(0);
        radius = 1;
    }
    public MyCircle(int x, int y, int radius){
        setCenterX(x);
        setCenterY(y);
        setRadius(radius);
    }
    public MyCircle(MyPoint center, int radius){
        setRadius(radius);
        setCenter(center);
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();

    }

    public int getCenterY() {
        return center.getY();

    }

    public int getCenterXY() {
        return center.getXY();

    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public void setCenterY(int y){
        center.setY(y);
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MyCircle[radius=").append(radius).append(", center=").append(center.toString()).append("]");
        return sb.toString();
    }
    public double getArea(){
        double P = Math.PI * Math.pow(radius,2);
        return P;

    }
    public double getCircumference(){
        double o = (Math.PI * 2) * radius;
        return o;
    }


}
