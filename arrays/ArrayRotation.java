package arrays;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int[] array = new int[input.length];

        for (int i = 0; i < array.length; i++) {
            array[i] += Integer.parseInt(input[i]);
        }

        int n = Integer.parseInt(scanner.nextLine());

        int temp;

        for (int i = 0; i < n; i++) {

            temp = array[0];

            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }

            array[array.length - 1] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
