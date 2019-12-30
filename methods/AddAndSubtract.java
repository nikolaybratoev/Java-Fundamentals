package methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(subtractNumbers(sumFirstTwoNumbers(firstNumber, secondNumber), thirdNumber));

    }

    private static int sumFirstTwoNumbers(int firstNumber, int secondNumber) {
        int sum = 0;
        sum = firstNumber + secondNumber;
        return sum;
    }

    private static int subtractNumbers(int sum, int thirdNumber) {
        int result = 0;
        result = sum - thirdNumber;
        return result;
    }
}
