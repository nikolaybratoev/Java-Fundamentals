package methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);

        if (a < b) {
            printChars(a, b);
        } else {
            printChars2(b, a);
        }

    }

    private static void printChars(char a, char b) {
        for (int i = a + 1; i < b; i++) {
            System.out.print((char) i + " ");
        }
    }

    private static void printChars2(char b, char a) {
        for (int i = b + 1; i < a; i++) {
            System.out.print((char) i + " ");
        }
    }
}
