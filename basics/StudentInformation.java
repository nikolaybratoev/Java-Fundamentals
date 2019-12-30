package basics;

import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",
                scanner.nextLine(), scanner.nextInt(), scanner.nextDouble());

    }
}
