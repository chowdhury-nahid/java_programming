package loops;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScores {

    public static void main(String[] args) {

        int numberOfStudents = 24;
        int numberOfSubjects = 4;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<numberOfStudents; i++)
        {
            double total =0;
            for(int j=0; j<numberOfSubjects; j++){

                System.out.println("enter the score of subject #"+(j+1));
                double score = scanner.nextDouble();
                total = total + score;
            }

            double average = total/numberOfSubjects;
            System.out.println("The average score is "+ average);
        }

        scanner.close();
    }
}
