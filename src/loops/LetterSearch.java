package loops;

import java.util.Scanner;

/**
 * Created by Nahid Chowdhury
 * Date: 4/14/2022
 * Time: 4:25 AM
 */
/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter ‘A’.
 */
public class LetterSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        System.out.println("Please enter the String");
        String newString = scanner.next();

        for(int i=0; i<newString.length(); i++){
            char currentLetter = newString.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Found the letter A");
        }
        else{
            System.out.println("Not found the letter A");
        }

    }
}
