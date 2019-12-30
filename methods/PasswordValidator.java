package methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isBetween6And10 = checkLength(password);

        if (isBetween6And10 == false) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isValid = checkForLettersAndDigits(password);

        if (isValid == false) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean haveDigits = checkDigits(password);

        if (haveDigits == false) {
            System.out.println("Password must have at least 2 digits");
        }

        if (isBetween6And10 && isValid && haveDigits) {
            System.out.println("Password is valid");
        }

    }

    private static boolean checkLength(String password) {
        return password.length() >= 6 && password.length() <= 10 ? true : false;
    }

    private static boolean checkForLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {

            char character = password.charAt(i);

            if (!Character.isLetterOrDigit(character)) {
                return false;
            }
        }

        return true;
    }

    private static boolean checkDigits(String password) {
        int counter = 0;

        for (int i = 0; i < password.length(); i++) {

            char character = password.charAt(i);

            if (Character.isDigit(character)) {
                counter++;
            }
        }

        return counter >= 2 ? true : false;
    }
}
