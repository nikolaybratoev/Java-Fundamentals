package basics;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double sum = 0;

        for (int game = 1; game <= lostGames; game++) {

            if (game % 2 == 0) {
                sum += headsetPrice;
            }

            if (game % 3 == 0) {
                sum += mousePrice;
            }

            if (game % 6 == 0) {
                sum += keyboardPrice;
            }

            if (game % 12 == 0) {
                sum += displayPrice;
            }
        }

        System.out.printf("Rage expenses: %.2f lv.", sum);

    }
}
