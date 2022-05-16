package polymorphism;

/**
 * Created by Nahid Chowdhury
 * Date: 5/16/2022
 * Time: 10:00 AM
 */

public class Zoo {

    public static void main(String[] args) {

        Dog valu = new Dog();
        valu.fetch();

        Animal kalu = new Dog();
        kalu.makeSound();
        valu.makeSound();
        feed(valu);

        kalu = new Cat();
        kalu.makeSound();
        ((Cat)kalu).scratch();
        feed(kalu);
    }

    public static void feed(Animal animal){

        if(animal instanceof Dog){
            System.out.println("Dog food");
        }
        if(animal instanceof Cat){
            System.out.println("Cat food");
        }

        if(animal instanceof Animal){
            System.out.println("Just an animal food");
        }
    }
}
