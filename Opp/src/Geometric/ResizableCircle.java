package Geometric;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public double resize(int percent) {
        return radius = (radius / percent) * 100;
    }
}
