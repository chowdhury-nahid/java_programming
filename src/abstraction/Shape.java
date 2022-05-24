package abstraction;

/**
 * Created by Nahid Chowdhury
 * Date: 5/19/2022
 * Time: 9:51 AM
 */

public abstract class Shape {

    abstract double calculateArea();

    public void print(){
        System.out.println("I am a shape");
    }
}
