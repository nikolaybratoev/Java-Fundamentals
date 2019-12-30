package methods;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(sumEvenDigits(number) * sumOddDigits(number));

    }

    private static int sumEvenDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;

            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
        }

        return sum;
    }

    private static int sumOddDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            number = number / 10;

            if (lastDigit % 2 != 0) {
                sum += lastDigit;
            }
        }

        return sum;
    }
}
