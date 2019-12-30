package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondPlayer = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String winner = "";
        int index = -1;

        while (firstPlayer.size() != 0 || secondPlayer.size() != 0) {

            index++;

            if (size(firstPlayer)) break;
            if (size(secondPlayer)) break;

            int firstPlayerCart = firstPlayer.get(index);
            int secondPlayerCart = secondPlayer.get(index);

            if (firstPlayerCart == secondPlayerCart) {
                firstPlayer.remove(index);
                secondPlayer.remove(index);
                index--;
                continue;
            }

            if (firstPlayerCart > secondPlayerCart) {
                int winningCard = firstPlayer.get(index);
                firstPlayer.remove(index);
                firstPlayer.add(winningCard);
                int losingCard = secondPlayer.get(index);
                secondPlayer.remove(index);
                firstPlayer.add(losingCard);
                winner = "First";
            } else {
                int winningCard = secondPlayer.get(index);
                secondPlayer.remove(index);
                secondPlayer.add(winningCard);
                int losingCard = firstPlayer.get(index);
                firstPlayer.remove(index);
                secondPlayer.add(losingCard);
                winner = "Second";
            }

            index--;

        }

        int sum = 0;

        if (winner.equals("Second")) {
            sum = getSum(secondPlayer, sum);
        } else {
            sum = getSum(firstPlayer, sum);
        }

        System.out.printf("%s player wins! Sum: %d", winner, sum);

    }

    private static boolean size(List<Integer> firstPlayer) {
        if (firstPlayer.size() == 0) {
            return true;
        }

        return false;
    }

    private static int getSum(List<Integer> secondPlayer, int sum) {
        for (Integer card : secondPlayer) {
            sum += card;
        }

        return sum;
    }
}
