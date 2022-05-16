package polymorphism;

/**
 * Created by Nahid Chowdhury
 * Date: 5/16/2022
 * Time: 9:56 AM
 */

public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("woof!");
    }

    public void fetch(){
        System.out.println("Fetching is fun!");
    }
}
