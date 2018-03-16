public class Circle {
    private double radius;
    private String color = "red";

    public Circle(){
        radius = 1.0;

    }
    public Circle(double r){
        this.radius = r;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2.0);
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle [radius=" + radius +"]";
    }
}
