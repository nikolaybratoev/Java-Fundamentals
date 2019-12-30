package maps;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        returnObtainedItemAndMaterials(scanner);

    }

    private static void returnObtainedItemAndMaterials(Scanner scanner) {
        Map<String, Integer> keyMaterial = new HashMap<>();
        putKeyMaterials(keyMaterial);

        Map<String, Integer> junk = new TreeMap<>();

        String winner = getLegendary(scanner, keyMaterial, junk);

        String first = winMethod(winner);

        System.out.println(first + " obtained!");

        sortAndPrintKeyMaterials(keyMaterial);

        printJunkMaterials(junk);

    }

    private static void printJunkMaterials(Map<String, Integer> junk) {
        for (Map.Entry<String, Integer> e : junk.entrySet()) {
            System.out.printf("%s: %d%n",
                    e.getKey(),
                    e.getValue());
        }
    }

    private static void putKeyMaterials(Map<String, Integer> keyMaterial) {
        keyMaterial.put("shards", 0);
        keyMaterial.put("fragments", 0);
        keyMaterial.put("motes", 0);
    }

    private static void sortAndPrintKeyMaterials(Map<String, Integer> keyMaterial) {
        keyMaterial
                .entrySet()
                .stream()
                .sorted((a, b) -> {
            if (b.getValue() - a.getValue() == 0) {
                return a.getKey().compareTo(b.getKey());
            } else {
                return b.getValue() - a.getValue();
            }
        }).forEach(e -> {
            System.out.printf("%s: %d%n",
                    e.getKey(),
                    e.getValue());
        });
    }

    private static String getLegendary(Scanner scanner, Map<String, Integer> keyMaterial, Map<String, Integer> junk) {
        boolean gotLegendary = false;
        String winner = "";
        String command = scanner.nextLine();

        while (!gotLegendary) {

            String[] input = command.split("\\s+");

            for (int i = 0; i < input.length; i += 2) {

                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (keyMaterial.containsKey(material)) {

                    keyMaterial.put(material, keyMaterial.get(material) + quantity);

                    if (keyMaterial.get(material) >= 250) {
                        winner = material;
                        keyMaterial.put(material, keyMaterial.get(material) - 250);
                        gotLegendary = true;
                        break;
                    }

                } else {
                    if (!junk.containsKey(material)) {

                        junk.put(material, quantity);

                    } else {
                        junk.put(material, junk.get(material) + quantity);
                    }
                }
            }

            if (gotLegendary) {
                break;
            }

            command = scanner.nextLine();

        }

        return winner;
    }

    private static String winMethod(String winner) {
        switch (winner) {
            case "motes":
                return "Dragonwrath";

            case "fragments":
                return "Valanyr";

            case "shards":
                return "Shadowmourne";

            default:
                return "error";
        }
    }
}
