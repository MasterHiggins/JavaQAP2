package Semester3Java.LearningJava.JavaQAP2;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getters/setters for x and y
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(MyPoint otherPoint) {
        int xDiff = otherPoint.x - this.x;    //Getting the distance of values
        int yDiff = otherPoint.y - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);   //Adding together values ^2
    }

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(4, 6);

        double dist = point1.distance(point2);
        System.out.println("Distance between " + point1 + " and " + point2 + ": " + dist);
    }
}
