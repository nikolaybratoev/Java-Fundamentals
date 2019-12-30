package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        saveAndPrintOrders(scanner, input);

    }

    private static void saveAndPrintOrders(Scanner scanner, String input) {
        Map<String, Double> products = new LinkedHashMap<>();
        Map<String, Integer> remember = new LinkedHashMap<>();

        getProducts(scanner, input, products, remember);

        printProducts(products);

    }

    private static void printProducts(Map<String, Double> products) {
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.printf("%s -> %.2f%n",
                    entry.getKey(),
                    entry.getValue());
        }
    }

    private static void getProducts(Scanner scanner, String input, Map<String, Double> products, Map<String, Integer> remember) {
        while (!input.equals("buy")) {

            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            double price = Double.parseDouble(tokens[1]);
            int quantity = Integer.parseInt(tokens[2]);

            if (!products.containsKey(name)) {
                products.put(name, quantity * price);
                remember.put(name, quantity);
            } else {
                remember.put(name, remember.get(name) + quantity);
                products.put(name, remember.get(name) * price);
            }

            input = scanner.nextLine();
        }
    }
}
