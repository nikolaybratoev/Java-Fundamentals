package maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class ForceBook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        engine(reader);

    }

    private static void engine(BufferedReader reader) throws IOException {

        Map<String, TreeSet<String>> sides = new LinkedHashMap<>();

        takeCheckData(reader, sides);

        sortPrint(sides);

    }

    private static void takeCheckData(BufferedReader reader, Map<String, TreeSet<String>> sides) throws IOException {
        String input;

        while (!"Lumpawaroo".equals(input = reader.readLine())) {

            String[] data = input.split("\\s+\\|\\s+|\\s+->\\s+");

            if (input.contains("|")) {

                if (!sides.containsKey(data[0])) {
                    sides.put(data[0], new TreeSet<>());
                }

                boolean contains = isContains(sides, data[1]);

                if (!contains) {
                    sides.get(data[0]).add(data[1]);
                }

            } else {
                sides.forEach((key, value) -> value.remove(data[0]));

                if (!sides.containsKey(data[1])) {
                    sides.put(data[1], new TreeSet<>());
                }

                printIfSideChange(sides, data);

            }
        }
    }

    private static void sortPrint(Map<String, TreeSet<String>> sides) {
        sides.entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    int compare = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    if (compare == 0) {
                        compare = e1.getKey().compareTo(e2.getKey());
                    }
                    return compare;
                })
                .forEach(e -> {
            System.out.printf("Side: %s, Members: %d%n",
                    e.getKey(),
                    e.getValue().size());
            e.getValue()
                    .forEach(a -> System.out.printf("! %s%n", a));
        });
    }

    private static void printIfSideChange(Map<String, TreeSet<String>> sides, String[] data) {
        sides.get(data[1]).add(data[0]);
        System.out.printf("%s joins the %s side!%n",
                data[0],
                data[1]);
    }

    private static boolean isContains(Map<String, TreeSet<String>> sides, String datum) {
        boolean contains = false;

        for (Map.Entry<String, TreeSet<String>> entry : sides.entrySet()) {
            if (entry.getValue().contains(datum)) {
                contains = true;
                break;
            }
        }

        return contains;
    }
}
