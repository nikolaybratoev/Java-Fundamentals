package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] command = input.split("\\s+");

            if (input.contains("Add")) {
                int wagon = Integer.parseInt(command[1]);

                wagons.add(wagon);
            } else {
                int passengers = Integer.parseInt(command[0]);

                for (int i = 0; i < wagons.size(); i++) {
                    int newPassengersCount = passengers + wagons.get(i);

                    if (newPassengersCount <= maxCapacity) {
                        wagons.set(i, newPassengersCount);
                        break;
                    }
                }
            }

            input = scanner.nextLine();

        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }
}
