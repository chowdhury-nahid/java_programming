package objects;

/**
 * Created by Nahid Chowdhury
 * Date: 4/25/2022
 * Time: 12:44 PM
 */
/*
 * Write a class that creates instances of the Rectangle class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {

    public static void main(String[] args) {

        Rectangle room1 = new Rectangle();
        room1.setWidth(25);
        room1.setLength(50);
        double areaOfRoom1 = room1.calculateArea();


        Rectangle room2 = new Rectangle(45,30);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1+areaOfRoom2;
        System.out.println("Total Area of the rooms is "+totalArea);

    }
}
