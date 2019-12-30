package text_processing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String newString = "";

        newString += input.charAt(0);

        for (int i = 1; i < input.length() - 1; i++) {

            if (input.charAt(i) == input.charAt(i + 1)) {

                if (input.charAt(i) == input.length() - 1) {
                    newString += input.charAt(i);
                }

                continue;
            } else {
                newString += input.charAt(i + 1);
            }
        }

        System.out.println(newString);

    }
}
