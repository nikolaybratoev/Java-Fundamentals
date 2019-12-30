package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Long> collection = new LinkedHashMap<>();

        collectResources(scanner, input, collection);

        printResources(collection);

    }

    private static void printResources(Map<String, Long> collection) {
        for (Map.Entry<String, Long> entry : collection.entrySet()) {
            System.out.printf("%s -> %d%n",
                    entry.getKey(),
                    entry.getValue());
        }
    }

    private static void collectResources(Scanner scanner, String input, Map<String, Long> collection) {
        while (!input.equals("stop")) {

            String resource = input;
            long quantity = Long.parseLong(scanner.nextLine());

            if (!collection.containsKey(resource)) {
                collection.put(resource, quantity);
            } else {
                collection.put(resource, collection.get(resource) + quantity);
            }

            input = scanner.nextLine();

        }
    }
}
