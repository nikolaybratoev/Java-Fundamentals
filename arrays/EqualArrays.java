package arrays;

import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split("\\s+");
        String[] secondArray = scanner.nextLine().split("\\s+");

        int[] firstNumbers = new int[firstArray.length];

        for (int i = 0; i < firstNumbers.length; i++) {
            firstNumbers[i] += Integer.parseInt(firstArray[i]);
        }

        int[] secondNumbers = new int[secondArray.length];

        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] += Integer.parseInt(secondArray[i]);
        }

        int sum = 0;
        boolean isIdentical = true;

        for (int i = 0; i < firstNumbers.length; i++) {

            if (firstNumbers[i] == secondNumbers[i]) {
                sum += firstNumbers[i];
            } else {
                isIdentical = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
        }

        if (isIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
