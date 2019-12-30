package basics;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int index = start; index <= end; index++) {

            System.out.print(index + " ");
            sum += index;
        }

        System.out.println();
        System.out.printf("Sum: %d", sum);

    }
}
