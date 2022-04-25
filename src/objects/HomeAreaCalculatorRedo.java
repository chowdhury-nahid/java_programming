package objects;

import java.util.Scanner;

/**
 * Created by Nahid Chowdhury
 * Date: 4/26/2022
 * Time: 12:47 AM
 */

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle livingRoom = calculator.getRoom();
        calculator.scanner.close();
        double area = calculator.calculateTotalArea(kitchen, livingRoom);
        System.out.println("Total area of the flat it: " +area);

    }

    public Rectangle getRoom() {

        System.out.println("Please enter the length of the room: ");
        double length = scanner.nextDouble();

        System.out.println("Please enter the width of the room: ");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);

    }

    public double calculateTotalArea(Rectangle room1, Rectangle room2) {

        return room1.calculateArea() + room2.calculateArea();
    }
}
