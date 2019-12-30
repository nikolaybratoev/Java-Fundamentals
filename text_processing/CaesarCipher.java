package text_processing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String encrypted = "";

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            encrypted += (char) (character + 3);
        }

        System.out.println(encrypted);

    }
}
