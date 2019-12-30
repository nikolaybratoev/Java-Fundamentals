package basics;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (secondNumber == 1) {

            for (int i = 1; i <= 10; i++) {

                int result = firstNumber * i;
                System.out.printf("%d X %d = %d%n", firstNumber, i, result);
                result = 0;
            }

        } else if (secondNumber > 1 && secondNumber <= 10) {

            for (int i = secondNumber; i <= 10; i++) {
                int result = firstNumber * i;
                System.out.printf("%d X %d = %d%n", firstNumber, i, result);
                result = 0;
            }

        } else {
            System.out.printf("%d X %d = %d", firstNumber, secondNumber, firstNumber * secondNumber);
        }

    }
}
