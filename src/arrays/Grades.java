package arrays;

import java.util.Scanner;

/**
 * Created by Nahid Chowdhury
 * Date: 5/9/2022
 * Time: 11:59 PM
 */

public class Grades {

    public static int[] grades;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter the number of grades: ");
        int gradeNumber = scanner.nextInt();
        grades = new int[gradeNumber];
        collectGrades(grades);
        scanner.close();

        System.out.println("The average of all grades is: "+String.format("%.2f",getAverageGrade(grades)));
        System.out.println("The highest grade is: "+getHighestGrade(grades));
        System.out.println("The lowest grade is: "+getLowestGrade(grades));

    }

    public static void collectGrades(int[] array){
        for(int i=0; i< array.length;i++){
            System.out.println("The grade of subject #"+(i+1));
            array[i] = scanner.nextInt();
        }
    }

    public static int calculateTotalGrades(int[] array){
        int totalGrade=0;
        for(int grade: array){
            totalGrade= totalGrade+grade;
        }
        return totalGrade;
    }

    public static double getAverageGrade(int[] array){
        return calculateTotalGrades(array)/array.length;

    }

    public static int getHighestGrade(int[] array){
        int highestGrade = array[0];
        for(int grade: array){
            if(grade>highestGrade){
                highestGrade = grade;
            }
        }
        return highestGrade;
    }

    public static int getLowestGrade(int[] array){
        int lowestGrade = array[0];
        for(int grade: array){
            if(grade<lowestGrade){
                lowestGrade = grade;
            }
        }
        return lowestGrade;
    }

}
