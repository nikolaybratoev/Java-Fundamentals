package arrays;

import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int[] array = new int[input.length];

        for (int i = 0; i < array.length; i++) {
            array[i] += Integer.parseInt(input[i]);
        }

        for (int i = 0; i < array.length; i++) {

            boolean isBigger = true;

            for (int j = i + 1; j < array.length; j++) {

                if (array[i] <= array[j]) {
                    isBigger = false;
                }
            }

            if (isBigger) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
