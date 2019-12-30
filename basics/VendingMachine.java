package basics;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double sum = 0.0;

        while (!command.equals("Start")) {

            double coin = Double.parseDouble(command);

            if (coin != 0.1 && coin != 0.2 && coin != 0.5 && coin != 1.0 && coin != 2.0) {
                System.out.printf("Cannot accept %.2f%n", coin);
            } else {
                sum += coin;
            }

            command = scanner.nextLine();

        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {

            switch (input) {

                case "Nuts":
                    if (sum >= 2.0) {
                        sum -= 2.0;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;

                case "Water":
                    if (sum >= 0.7) {
                        sum -= 0.7;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;

                case "Crisps":
                    if (sum >= 1.5) {
                        sum -= 1.5;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;

                case "Soda":
                    if (sum >= 0.8) {
                        sum -= 0.8;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;

                case "Coke":
                    if (sum >= 1.0) {
                        sum -= 1.0;
                        System.out.printf("Purchased %s%n", input);
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                    }
                    break;

                default:
                    System.out.printf("Invalid product%n");
            }

            input = scanner.nextLine();

        }

        System.out.printf("Change: %.2f", sum);

    }
}
