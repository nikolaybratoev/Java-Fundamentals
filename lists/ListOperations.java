package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        String[] input = scanner.nextLine().split("\\s+");

        for (int i = 0; i < input.length; i++) {
            numbers.add(i, Integer.parseInt(input[i]));
        }

        String command = scanner.nextLine();

        while (!command.equalsIgnoreCase("End")) {

            String[] token = command.split("\\s+");
            String type = token[0];
            String element = token[1];

            switch (type) {

                case "Add":
                    numbers.add(parseElement(element));
                    break;

                case "Insert":
                    insertElement(numbers, token[2], element);
                    break;

                case "Remove":
                    removeElement(numbers, element);
                    break;

                case "Shift":
                    shiftList(numbers, token);
                    break;
            }

            command = scanner.nextLine();
        }

        printNumbers(numbers);

    }

    private static void printNumbers(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static int parseElement(String element) {
        return Integer.parseInt(element);
    }

    private static void shiftList(ArrayList<Integer> numbers, String[] token) {
        String direction = token[1];
        int rotations = Integer.parseInt(token[2]);

        if (direction.equalsIgnoreCase("left")) {

            for (int i = 0; i < rotations % numbers.size(); i++) {
                int firstElement = numbers.remove(0);
                numbers.add(firstElement);
            }
        } else {

            for (int i = 0; i < rotations % numbers.size(); i++) {
                int lastElement = numbers.remove(numbers.size() - 1);
                numbers.add(0, lastElement);
            }
        }
    }

    private static void removeElement(ArrayList<Integer> numbers, String element) {
        int e = parseElement(element);

        if (e >= 0 && e < numbers.size()) {
            numbers.remove(e);
        } else {
            invalidSize();
        }

    }

    private static void insertElement(ArrayList<Integer> numbers, String s, String element) {
        int index = parseElement(s);
        int e = parseElement(element);

        if (index >= 0 && index < numbers.size()) {
            numbers.add(index, e);
        } else {
            invalidSize();
        }

    }

    private static void invalidSize() {
        System.out.println("Invalid index");
    }
}
