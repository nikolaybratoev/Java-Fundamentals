package methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        double result = calculateFactorialFirstNumber(firstNumber) / calculateFactorialSecondNumber(secondNumber);
        System.out.printf("%.2f", result);

    }

    private static long calculateFactorialFirstNumber(int number) {
        if (number <= 2) {
            return number;
        }

        return number * calculateFactorialFirstNumber(number -1);
    }

    private static long calculateFactorialSecondNumber(int number) {
        if (number <= 2) {
            return number;
        }

        return number * calculateFactorialSecondNumber(number - 1);
    }
}
