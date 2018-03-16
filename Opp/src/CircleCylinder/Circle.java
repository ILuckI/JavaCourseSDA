package CircleCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {}

    public Circle(double r) {
        this.radius = r;
    }

    public Circle(double r, String color) {
        this(r);
        this.color = color;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("Circle[radius=").append(radius).append(", color=").append(color).append("]").toString();
    }
}
