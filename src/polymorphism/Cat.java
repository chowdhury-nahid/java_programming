package polymorphism;

/**
 * Created by Nahid Chowdhury
 * Date: 5/16/2022
 * Time: 9:58 AM
 */

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("meow!");
    }

    public void scratch(){
        System.out.println("I scratch things");
    }
}
