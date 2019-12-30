package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < input.toCharArray().length; i++) {

            char ch = input.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (!counts.containsKey(ch)) {
                counts.put(ch, 1);
            } else {
                counts.put(ch, counts.get(ch) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.printf("%s -> %d%n",
                    entry.getKey(),
                    entry.getValue());
        }

    }
}
