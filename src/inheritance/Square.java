package inheritance;

/**
 * Created by Nahid Chowdhury
 * Date: 5/15/2022
 * Time: 5:23 PM
 */

public class Square extends Rectangle{

    @Override
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String text){
        System.out.println("I am a "+text);
    }

}
