package data_types;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int tankCapacity = 255;

        int litres = 0;

        for (int line = 1; line <= n; line++) {

            int currentLitres = Integer.parseInt(scanner.nextLine());
            litres += currentLitres;

            if (litres > tankCapacity) {
                System.out.printf("Insufficient capacity!%n");
                litres -= currentLitres;
                continue;
            }

        }

        System.out.println(litres);

    }
}
