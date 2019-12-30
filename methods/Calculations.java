package methods;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        returnResult(scanner.nextLine(), scanner.nextInt(), scanner.nextInt());

    }

    private static void returnResult(String command, int firstNumber, int secondNumber) {

        int result = 0;

        switch (command) {

            case "add":
                result = firstNumber + secondNumber;
                break;

            case "multiply":
                result = firstNumber * secondNumber;
                break;

            case "subtract":
                result = firstNumber - secondNumber;
                break;

            case "divide":
                result = firstNumber / secondNumber;
                break;
        }

        System.out.println(result);

    }
}
