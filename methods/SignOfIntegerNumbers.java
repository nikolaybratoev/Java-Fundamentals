package methods;

import java.util.Scanner;

public class SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        signInteger(n);

    }

    private static void signInteger (int number) {
        String sign;

        if (number > 0) {
            sign = "positive";
        } else if (number < 0) {
            sign = "negative";
        } else {
            sign = "zero";
        }

        System.out.printf("The number %d is %s.", number, sign);
    }
}
