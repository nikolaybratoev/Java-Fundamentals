package basics;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String reversed = "";
        for (int index = username.length() - 1; index >= 0; index--) {

            reversed += username.charAt(index);

        }

        int count = 1;

        String input = scanner.nextLine();

        while (!input.equals(reversed)) {

            if (count++ == 4) {
                System.out.println("User " + username + " blocked!");
                return;
            }

            System.out.println("Incorrect password. Try again.");

            input = scanner.nextLine();

        }

        System.out.printf("User %s logged in.", username);

    }
}
