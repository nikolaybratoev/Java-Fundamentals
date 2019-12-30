package maps;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!words.containsKey(word)) {
                words.put(word, new ArrayList<>());
                words.get(word).add(synonym);
            } else {
                words.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            System.out.print(entry.getKey() + " - ");

            for (int i = 0; i < entry.getValue().size(); i++) {

                if (i + 1 == entry.getValue().size()) {
                    System.out.printf("%s%n",
                            entry.getValue().get(i));
                } else {
                    System.out.printf("%s, ",
                            entry.getValue().get(i));
                }
            }
        }
    }
}
