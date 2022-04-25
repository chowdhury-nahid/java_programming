package objects;

/**
 * Created by Nahid Chowdhury
 * Date: 4/20/2022
 * Time: 10:08 PM
 */

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        setWidth(width); //just to show both are possible.
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    double calculateArea() {
        return length * width;
    }
}
