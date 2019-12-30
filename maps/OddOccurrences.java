package maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        Map<String, Integer> counts = new LinkedHashMap<>();

        wordsToLowerCaseAndPutInMap(words, counts);

        ArrayList<String> odds = new ArrayList<>();

        putOddWordsInList(counts, odds);

        printOddWords(odds);

    }

    private static void printOddWords(ArrayList<String> odds) {
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));

            if (i < odds.size() - 1) {
                System.out.print(", ");
            }
        }
    }

    private static void putOddWordsInList(Map<String, Integer> counts, ArrayList<String> odds) {
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }
        }
    }

    private static void wordsToLowerCaseAndPutInMap(String[] words, Map<String, Integer> counts) {
        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();

            if (!counts.containsKey(wordInLowerCase)) {
                counts.put(wordInLowerCase, 1);
            } else {
                counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
            }
        }
    }
}
