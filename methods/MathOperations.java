package methods;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculation(firstNumber, operator, secondNumber));

    }

    private static double calculation(int firstNumber, String operator, int secondNumber) {

        double sum = 0;

        if (operator.equals("/")) {
            sum = firstNumber / secondNumber;
        } else if (operator.equals("*")) {
            sum = firstNumber * secondNumber;
        } else if (operator.equals("+")) {
            sum = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            sum = firstNumber - secondNumber;
        }

        return sum;
    }
}
