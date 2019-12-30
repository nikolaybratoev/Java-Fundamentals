package methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();

        int productQuantity = Integer.parseInt(scanner.nextLine());

        switch (product) {

            case "coffee":
                returnCoffeeResult(productQuantity);
                break;

            case "water":
                returnWaterResult(productQuantity);
                break;

            case "coke":
                returnCokeResult(productQuantity);
                break;

            case "snacks":
                returnSnacksResult(productQuantity);
                break;
        }
    }

    private static void returnCoffeeResult(int productQuantity) {
        double price = 1.50;
        System.out.printf("%.2f", price * productQuantity);
    }

    private static void returnWaterResult(int productQuantity) {
        double price = 1.00;
        System.out.printf("%.2f", price * productQuantity);
    }

    private static void returnCokeResult(int productQuantity) {
        double price = 1.40;
        System.out.printf("%.2f", price * productQuantity);
    }

    private static void returnSnacksResult(int productQuantity) {
        double price = 2.00;
        System.out.printf("%.2f", price * productQuantity);
    }
}
