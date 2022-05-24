package collection;

import java.util.Map;

/**
 * Created by Nahid Chowdhury
 * Date: 5/24/2022
 * Time: 12:06 AM
 */

public class Gradebook {

    public static void main(String[] args) {

        Map<String, Integer> oldScore = TestResults.getOriginalGrades();
        Map<String, Integer> newScore = TestResults.getMakeUpGrades();

        for (var score : newScore.entrySet()) {

            Integer oldGrade = oldScore.get(score.getKey());
            Integer newGrade = newScore.get(score.getKey());

            if (oldGrade < newGrade) {
                oldScore.put(score.getKey(), newGrade);
            }
        }

        oldScore.forEach((s, g) -> System.out.println("Student: " + s + " Grade: " + g));
    }
}
