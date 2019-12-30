package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int startIndex = 0;
        int endIndex = 0;
        int count = 0;

        for (int i = 0; i < input.length; i++) {

            int nowCount = 0;

            for (int j = i; j < input.length; j++) {

                if (input[i] == input[j]) {
                    nowCount++;

                    if (nowCount > count) {
                        count = nowCount;
                        startIndex = i;
                        endIndex = j;
                    }
                } else {
                    break;
                }
            }
        }

        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(input[i] + " ");
        }

    }
}
