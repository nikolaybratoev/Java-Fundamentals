package maps;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = getIntegers(scanner);

        printTop3Integers(list);

    }

    private static void printTop3Integers(List<Integer> list) {
        list.stream()
                .limit(3)
                .forEach(e -> System.out.print(e + " "));
    }

    private static List<Integer> getIntegers(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
    }
}
