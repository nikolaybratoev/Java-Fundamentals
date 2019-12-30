package data_types;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int first = 0;
        int second = 0;
        boolean balanced = true;
        boolean unbalanced = false;

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            if (unbalanced && input.equals("(")) {
                System.out.println("UNBALANCED");
                balanced = false;
                break;
            } else {
                unbalanced = false;
            }

            if (input.equals("(")) {
                first++;
                unbalanced = true;
            } else if (input.equals(")")) {
                second++;
            }

        }

        if (balanced) {
            if (first == second) {
                System.out.println("BALANCED");
            } else {
                System.out.println("UNBALANCED");
            }
        }

    }
}
