package methods;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        System.out.println(findMin(findMin(firstNumber, secondNumber), thirdNumber));

    }

    private static int findMin(int a, int b) {
        if (a < b) {
            return a;
        }

        return b;
    }
}
