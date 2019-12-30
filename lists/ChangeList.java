package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        String[] array = scanner.nextLine().split("\\s+");

        for (int index = 0; index < array.length; index++) {
            numbers.add(index, Integer.parseInt(array[index]));
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            String[] data = command.split("\\s+");
            String type = data[0];
            int element = Integer.parseInt(data[1]);

            switch (type) {

                case "Delete":
                    while (numbers.contains(element)) {
                        int index = numbers.indexOf(element);
                        numbers.remove(index);
                    }
                    break;

                case "Insert":
                    int index = Integer.parseInt(data[2]);
                    numbers.add(index, element);
                    break;
            }

            command = scanner.nextLine();

        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
