package PointMovable;

public class Program {
    public static void main(String[] args) {
        MovablePoint move1 = new MovablePoint(2.0f,4.0f,3.0f,3.0f);
        System.out.println(move1);
        MovablePoint m2 = move1.move();
        System.out.println(m2);
    }
}
