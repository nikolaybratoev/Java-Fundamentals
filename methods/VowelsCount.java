package methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        System.out.println(countVowels(text));

    }

    private static int countVowels(String text) {
        int counter = 0;

        String lower = text.toLowerCase();

        for (int i = 0; i < lower.length(); i++) {

            char letter = lower.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'u'
                    || letter == 'o' || letter == 'i') {

                counter++;
            }
        }

        return counter;
    }
}
