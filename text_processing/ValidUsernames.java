package text_processing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] userNames = scanner.nextLine().split(", ");

        for (String name : userNames) {

            if (isValidLength(name)) {
                if (contains(name)) {
                    System.out.printf("%s%n",
                            name);
                }
            }
        }

    }

    private static boolean contains(String name) {
        for (int i = 0; i < name.length(); i++) {

            char ch = name.charAt(i);

            if (!Character.isLetter(ch) && !Character.isDigit(ch)
                    && ch != '_' && ch != '-') {
                return false;
            }
        }

        return true;
    }

    private static boolean isValidLength(String name) {
        return name.length() >= 3 && name.length() <= 16;
    }
}
