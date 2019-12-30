package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (true) {

            String[] command = scanner.nextLine().split("\\s+");

            if (command[0].equals("end")) {
                break;
            }

            int number = Integer.parseInt(command[1]);

            switch (command[0]) {

                case "Add":
                    numbers.add(number);
                    break;

                case "Remove":
                    numbers.remove(new Integer(number));
                    break;

                case "RemoveAt":
                    numbers.remove(number);
                    break;

                case "Insert":
                    int index = Integer.parseInt(command[2]);
                    numbers.add(index, number);
                    break;
            }
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
