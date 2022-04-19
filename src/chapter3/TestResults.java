package chapter3;

import java.util.Scanner;

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */
public class TestResults {
    public static void main(String[] args) {

        char grade;

        System.out.println("Please enter your test score.");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();

        if(score>=90){
            grade = 'A';
        }
        else if(score>=80){
            grade = 'B';
        }
        else if (score>=70){
            grade = 'C';
        }
        else if (score>=60){
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        System.out.println("You got "+ grade );
    }
}
