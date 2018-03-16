public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        this(1.0f,1.0f);
    }
    public Rectangle(float length, float width){
        setLength(length);
        setWidth(width);
    }

    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    public void setLength(float length){
        if (length >= 0)
            this.length = length;
        else
            System.out.println("Blad");
    }
    public void setWidth(float width){
        if (width >= 0)
            this.width = width;
        else
            System.out.println("Blad");
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (2 * width) + ( 2 * length) ;
    }
    public String toString() {
        return "Rectangle[lenght=" + length + " ,width=" + width + "]";
    }
}
