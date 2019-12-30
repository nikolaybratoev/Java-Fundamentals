package arrays;

import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int[] array = new int[input.length];

        for (int i = 0; i < array.length; i++) {
            array[i] += Integer.parseInt(input[i]);
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int number : array) {

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
        }

        System.out.println(evenSum - oddSum);

    }
}
