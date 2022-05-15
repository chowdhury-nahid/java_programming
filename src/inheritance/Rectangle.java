package inheritance;

/**
 * Created by Nahid Chowdhury
 * Date: 5/15/2022
 * Time: 5:20 PM
 */

public class Rectangle {

    protected double length;
    protected double width;
    protected double sides=4;

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

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    public double calculatePerimeter(){
        return (2*length)+(2*width);
    }

    public void print(){
        System.out.println("I am a rectangle");
    }
}
