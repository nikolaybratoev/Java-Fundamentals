package arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            if (i % 2 == 0) {
                firstArray[i] += Integer.parseInt(input[0]);
                secondArray[i] += Integer.parseInt(input[1]);
            } else {
                secondArray[i] += Integer.parseInt(input[0]);
                firstArray[i] += Integer.parseInt(input[1]);
            }
        }

        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }

    }
}
