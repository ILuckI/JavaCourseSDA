package PointMovable;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float x, float y) {
        setxSpeed(x);
        setySpeed(y);
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append("(").append(getX()).append(", ").append(getY()).append(", speed=(").append(getxSpeed()).append(", ").append(getySpeed()).append(")").toString();
    }

    public MovablePoint move() {
        MovablePoint temp = new MovablePoint(getX() + xSpeed, getY() + ySpeed, xSpeed, ySpeed);
        return temp;
    }
}
