package methods;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if (input.equals("int")) {
            int number = Integer.parseInt(scanner.nextLine());
            integerNumber(number);
        } else if (input.equals("real")) {
            double number = Double.parseDouble(scanner.nextLine());
            doubleNumber(number);
        } else if (input.equals("string")) {
            String text = scanner.nextLine();
            stringInput(text);
        }

    }

    private static void integerNumber(int number) {
        int sum = 0;
        sum = number * 2;
        System.out.println(sum);
    }

    private static void doubleNumber(double number) {
        double sum = 0;
        sum = number * 1.5;
        System.out.printf("%.2f", sum);
    }

    private static void stringInput(String input) {
        char surroundings = '$';
        System.out.println(surroundings + input + surroundings);
    }
}
