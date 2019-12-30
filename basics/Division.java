package basics;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String result = "The number is divisible by ";

        if (number % 10 == 0) {
            System.out.println(result + "10");
        } else if (number % 7 == 0) {
            System.out.println(result + "7");
        } else if (number % 6 == 0) {
            System.out.println(result + "6");
        } else if (number % 3 == 0) {
            System.out.println(result + "3");
        } else if (number % 2 == 0) {
            System.out.println(result + "2");
        } else {
            System.out.println("Not divisible");
        }

    }
}
