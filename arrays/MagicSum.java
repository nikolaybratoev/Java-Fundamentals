package arrays;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        int[] array = new int[input.length];

        for (int i = 0; i < array.length; i++) {
            array[i] += Integer.parseInt(input[i]);
        }

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++) {

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == number) {
                    System.out.println(array[i] + " " + array[j]);
                }
            }
        }

    }
}
