package data_types;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] numbers = scanner.nextLine().split("\\s+");

            long leftNumber = Long.parseLong(numbers[0]);
            long rightNumber = Long.parseLong(numbers[1]);

            long biggerNumber = rightNumber;

            if (leftNumber > rightNumber) {
                biggerNumber = leftNumber;
            }

            long sumDigits = 0;
            while (biggerNumber != 0) {
                sumDigits += biggerNumber % 10;
                biggerNumber /= 10;
            }

            System.out.println(Math.abs(sumDigits));
        }

    }
}
