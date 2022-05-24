package abstraction;

/**
 * Created by Nahid Chowdhury
 * Date: 5/19/2022
 * Time: 9:59 AM
 */

public class ShapeTester {

    public static void main(String[] args) {

        Shape rectangle= new Rectangle(5,7);

        rectangle.print();
        rectangle.calculateArea();
    }
}
