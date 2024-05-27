package Semester3Java.LearningJava.JavaQAP2;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyPoint topLeft = new MyPoint(0, 10);    //Setting values for testing
        MyPoint bottomRight = new MyPoint(10, 0);
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);    //Sending values to test

        System.out.println("Area of rectangle: " + rectangle.getArea());
    }
}
