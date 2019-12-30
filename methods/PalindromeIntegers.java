package methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            int number = Integer.parseInt(command);

            int reverse, sum = 0, temp;

            temp = number;

            while (number > 0) {
                reverse = number % 10;
                sum = (sum * 10) + reverse;
                number = number / 10;
            }

            printTrueOrFalse(sum, temp);

            command = scanner.nextLine();
        }
    }

    private static void printTrueOrFalse(int sum, int temp) {
        if (temp == sum) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
