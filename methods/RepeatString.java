package methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int repeatTimes = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(input, repeatTimes));

    }

    private static String repeatString(String input, int repeatString) {
        String repeat = "";

        for (int i = 0; i < repeatString; i++) {
            repeat += input;
        }

        return repeat;
    }
}