package Semester3Java.LearningJava.JavaQAP2;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    //Getters/setters for begin and end points
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public double getLength() {
        //Using formula to get length
        double xDiff = end.getX() - begin.getX();
        double yDiff = end.getY() - begin.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        //Calculating gradient in radians
        double xDiff = end.getX() - begin.getX();
        double yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);   //Much like above formula, except returning one value instead of adding twot that are squared
    }

    @Override  //Override for a cleaner and readable output
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(4, 6);

        MyLine line = new MyLine(point1, point2);
        System.out.println("Line: " + line);
    }
}
