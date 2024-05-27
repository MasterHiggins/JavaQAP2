package Semester3Java.LearningJava.JavaQAP2;

public class TestMyLine {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(4, 6);

        MyLine line1 = new MyLine(point1, point2);
        System.out.println("Line 1: " + line1);

        MyLine line2 = new MyLine(0, 0, 3, 4);
        System.out.println("Line 2: " + line2);

        System.out.println("Length of Line 1: " + line1.getLength());
        System.out.println("Gradient of Line 2: " + line2.getGradient());
    }
}
