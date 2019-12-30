package maps;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Map<Double, Integer> nums = new TreeMap<>();

        for (double number : numbers) {

            if (!nums.containsKey(number)) {
                nums.put(number, 1);
            } else {
                nums.put(number, nums.get(number) + 1);
            }

        }

        for (Map.Entry<Double, Integer> entry : nums.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.######");
            System.out.printf("%s -> %d%n",
                    df.format(entry.getKey()),
                    entry.getValue());
        }

    }
}
