package loops;

import java.util.Random;

/**
 * Created by Nahid Chowdhury
 * Date: 4/16/2022
 * Time: 8:28 AM
 */

public class RollTheDieGameExercise {
    public static void main(String[] args) {

        Random random = new Random();

        int lastSpace = 20;
        int rolls = 5;
        int currentSpace = 0;


        for(int i=1; i<=rolls; i++){
            int die = random.nextInt(6)+1;
            currentSpace= currentSpace+die;
            if(currentSpace == lastSpace){
                System.out.println("Roll #"+i+": You've rolled a "+die+" . You are now on space "+currentSpace+". Congrats, you win!");
                break;
            }
            else if(currentSpace>lastSpace){
                System.out.println("Sorry you have lost! You passed "+lastSpace);
                break;
            }
            else if (i==rolls && currentSpace< lastSpace){
                System.out.println(String.format("Sorry you rolled %d and currently at %d space, and you have failed to reach.",die,currentSpace));
            }
            else {
                int spacesToGO = lastSpace - currentSpace;
                System.out.println(String.format("Roll #%d: You've rolled a %d . You are now on space %d and have %d more to go.", i, die, currentSpace, spacesToGO));
            }

        }
    }
}
