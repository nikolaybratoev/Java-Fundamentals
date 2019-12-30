package data_types;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int start = 97;

        int end = 97 + n;

        for (int first = start; first < end; first++) {

            for (int second = start; second < end; second++) {

                for (int third = start; third < end; third++) {
                    System.out.printf("%c%c%c%n", first, second, third);
                }
            }
        }
    }
}
