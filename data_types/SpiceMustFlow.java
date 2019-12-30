package data_types;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int currentYield = 0;

        while (startingYield >= 100) {

            days++;
            currentYield += startingYield;
            startingYield -= 10;
            currentYield -= 26;

        }

        currentYield -= 26;

        System.out.println(days);
        System.out.println(currentYield);

    }
}
