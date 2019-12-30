package data_types;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 2; number <= n; number++) {

            boolean isPrime = true;

            for (int number2 = 2; number2 < number; number2++) {

                if (number % number2 == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.printf("%d -> %b%n", number, isPrime);
        }

    }
}
