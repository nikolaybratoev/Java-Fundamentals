package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {

            String[] input = scanner.nextLine().split("\\s+");

            if (input[0].equals("end")) {
                break;
            }

            switch (input[0]) {

                case "Contains":
                    int number = Integer.parseInt(input[1]);

                    if (numbers.contains(number)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    if (input[1].equals("even")) {

                        for (Integer num : numbers) {
                            if (num % 2 == 0) {
                                System.out.print(num + " ");
                            }
                        }

                        System.out.println();
                    } else if (input[1].equals("odd")) {

                        for (Integer num : numbers) {
                            if (num % 2 != 0) {
                                System.out.print(num + " ");
                            }
                        }
                    }
                    break;

                case "Get":
                    int sum = 0;

                    for (int i = 0; i < numbers.size(); i++) {
                        sum += numbers.get(i);
                    }

                    System.out.println(sum);
                    break;

                case "Filter":
                    switch (input[1]) {

                        case ">":
                            int n = Integer.parseInt(input[2]);

                            for (Integer currNum : numbers) {
                                if (currNum > n) {
                                    System.out.print(currNum + " ");
                                }
                            }

                            System.out.println();
                            break;

                        case ">=":
                            int a = Integer.parseInt(input[2]);

                            for (Integer currNum : numbers) {
                                if (currNum >= a) {
                                    System.out.print(currNum + " ");
                                }
                            }

                            System.out.println();
                            break;

                        case "<":
                            int b = Integer.parseInt(input[2]);

                            for (Integer currNum : numbers) {
                                if (currNum < b) {
                                    System.out.print(currNum + " ");
                                }
                            }

                            System.out.println();
                            break;

                        case "<=":
                            int c = Integer.parseInt(input[2]);

                            for (Integer currNum : numbers) {
                                if (currNum <= c) {
                                    System.out.print(currNum + " ");
                                }
                            }

                            System.out.println();
                            break;
                    }
                    break;
            }
        }

    }
}
