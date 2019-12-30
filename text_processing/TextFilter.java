package text_processing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");

        String text = scanner.nextLine();

        for (String word : bannedWords) {

            if (text.contains(word)) {
                String replacement = repeatStr("*", word.length());
                text = text.replace(word, replacement);
            }

        }

        System.out.println(text);

    }

    private static String repeatStr(String s, int length) {
        String replacement = "";

        for (int i = 0; i < length; i++) {
            replacement += s;
        }

        return replacement;
    }
}
