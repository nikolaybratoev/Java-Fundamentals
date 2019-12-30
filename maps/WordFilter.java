package maps;

import java.util.Arrays;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = getStrings(scanner);

        printStrings(words);

    }

    private static void printStrings(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static String[] getStrings(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(e -> e.length() % 2 == 0)
                .toArray(String[]::new);
    }
}
