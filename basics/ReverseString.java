package basics;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        String reversed = "";
        for (int index = word.length() - 1; index >= 0; index--) {
            reversed += word.charAt(index);
        }

        System.out.println(reversed);

    }
}
