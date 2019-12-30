package lists;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        List<Double> numbers = new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            double number = Double.parseDouble(input[i]);
            numbers.add(i, number);
        }

        for (int i = 0; i < numbers.size() - 1; i++) {

            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, (numbers.get(i) + numbers.get(i + 1)));
                numbers.remove(i + 1);
                i = -1;
            }
        }

        System.out.println(joinElementsByDelimiter(numbers, " "));

    }

    private static String joinElementsByDelimiter(List<Double> numbers, String delimiter) {
        String output = "";

        for (Double number : numbers) {
            output += (new DecimalFormat("0.#").format(number) + delimiter);
        }

        return output;
    }
}