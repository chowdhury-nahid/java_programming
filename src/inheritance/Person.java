package inheritance;

/**
 * Created by Nahid Chowdhury
 * Date: 5/15/2022
 * Time: 12:48 PM
 */

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("In Person Default Constructor");
    }

    public Person(String name) {
        System.out.println("In Person 2nd Constructor. Name is set");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
