package methods;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        returnTopNumber(number);

    }

    private static void returnTopNumber(int number) {

        for (int i = 0; i <= number; i++) {

            int sum = 0;
            boolean oddDigit = false;
            int copy = i;

            while (true) {

                if (copy == 0) break;

                int right = copy % 10;
                sum += right;

                if (!(right % 2 ==0)) {
                    oddDigit = true;
                }

                copy /= 10;
            }

            if (sum % 8 == 0 && oddDigit) {
                System.out.println(i);
            }
        }
    }
}
