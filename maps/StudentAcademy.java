package maps;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        collectInfoAndPrintAvgGrades(scanner);

    }

    private static void collectInfoAndPrintAvgGrades(Scanner scanner) {
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> list = new TreeMap<>();
        Map<String, Double> avg = new TreeMap<>(Collections.reverseOrder());

        addInList(scanner, n, list);

        findAverageGrade(list, avg);

        filterAndPrintTheList(avg);

    }

    private static void filterAndPrintTheList(Map<String, Double> avg) {
        avg.entrySet()
                .stream()
                .filter(e -> e.getValue() >= 4.5)
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(a -> {
                    System.out.printf("%s -> %.2f%n",
                            a.getKey(),
                            a.getValue());
                });
    }

    private static void findAverageGrade(Map<String, List<Double>> list, Map<String, Double> avg) {
        for (Map.Entry<String, List<Double>> entry : list.entrySet()) {
            double total = 0;
            double average;

            for (int i = 0; i < entry.getValue().size(); i++) {
                total += entry.getValue().get(i);
            }

            average = total / entry.getValue().size();
            avg.put(entry.getKey(), average);

        }
    }

    private static void addInList(Scanner scanner, int n, Map<String, List<Double>> list) {
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!list.containsKey(name)) {
                list.put(name, new ArrayList<>());
                list.get(name).add(grade);
            } else {
                list.get(name).add(grade);
            }

        }
    }
}
