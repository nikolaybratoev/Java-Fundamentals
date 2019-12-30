package data_types;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String letter = "";

        for (int i = 0; i < n; i++) {

            char character = scanner.nextLine().charAt(0);

            character += key;
            letter += character;
        }

        System.out.printf("%s", letter);

    }
}
