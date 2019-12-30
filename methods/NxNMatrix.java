package methods;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        printMatrix(input);

    }

    private static void printMatrix(int input) {
        for (int col = 0; col < input; col++) {

            for (int row = 1; row < input; row++) {
                System.out.print(input + " ");
            }

            System.out.println(input);
        }
    }
}
