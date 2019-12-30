package arrays;

import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] characters = scanner.nextLine().split("\\s+");

        for (int i = 0; i < characters.length / 2; i++) {

            String temp = characters[i];

            characters[i] = characters[characters.length - 1 - i];
            characters[characters.length - 1 - i] = temp;

        }

        for (String chars : characters) {
            System.out.print(chars + " ");
        }

    }
}