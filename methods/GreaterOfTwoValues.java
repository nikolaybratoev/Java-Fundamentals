package methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();

        if (input.equals("int")) {
            System.out.println(getMax(scanner.nextInt(), scanner.nextInt()));
        } else if (input.equals("char")) {
            System.out.println(getMax(scanner.nextLine().charAt(0), scanner.nextLine().charAt(0)));
        } else if (input.equals("String".toLowerCase())) {
            System.out.println(getMax(scanner.nextLine(), scanner.nextLine()));
        }

    }

    private static int getMax(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        }

        return secondNumber;
    }

    private static char getMax(char a, char b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    private static String getMax(String firstString, String secondString) {
        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        }

        return secondString;
    }
}
