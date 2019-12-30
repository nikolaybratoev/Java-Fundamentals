package methods;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        returnGradeScore(new Scanner(System.in).nextDouble());

    }

    private static void returnGradeScore(double grade) {
        String score;
        if (grade <= 2.99) {
            score = "Fail";
        } else if (grade <= 3.49) {
            score = "Poor";
        } else if (grade <= 4.49) {
            score = "Good";
        } else if (grade <= 5.49) {
            score = "Very good";
        } else {
            score = "Excellent";
        }

        System.out.println(score);
    }

}
