package Semester3Java.LearningJava.JavaQAP2;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {   //Getting values
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft() {    //Setting Values
        return this.topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return this.bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    //Returning after area calulation
    public int getArea() {
        int width = this.bottomRight.getX() - this.topLeft.getX();
        int height = this.bottomRight.getY() - this.topLeft.getY();
        return width * height;
    }
}
