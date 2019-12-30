package arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[n];

        for (int i = 0; i < n; i++) {
            wagons[i] += Integer.parseInt(scanner.nextLine());
        }

        int sum = 0;

        for (int i = 0; i < wagons.length; i++) {
            System.out.print(wagons[i] + " ");
            sum += wagons[i];
        }

        System.out.println();
        System.out.println(sum);

    }
}
