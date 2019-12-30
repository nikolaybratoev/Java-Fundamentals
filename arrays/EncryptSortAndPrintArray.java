package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stringsNumber = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[stringsNumber];

        for (int i = 0; i < stringsNumber; i++) {

            String input = scanner.nextLine();

            int length = input.length();

            int sum = 0;
            for (int j = 0; j < input.length(); j++) {

                char current = input.charAt(j);

                if (current == 'a' || current == 'e' || current == 'i' ||
                        current == 'o' || current == 'u' || current == 'A' || current == 'E' ||
                        current == 'I' || current == 'O' || current == 'U') {

                    sum += current * length;

                } else {
                    sum += current / length;
                }

                numbers[i] = sum;
            }
        }

        Arrays.sort(numbers);

        for (int element : numbers) {
            System.out.println(element);
        }

    }
}
