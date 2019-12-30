package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> guests = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = scanner.nextLine();

            if (input.contains("is going!")) {

                String[] data = input.split("\\s+");
                String name = data[0];

                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guests.add(name);
                }

            } else if (input.contains("is not going!")) {

                String[] data = input.split("\\s+");
                String name = data[0];

                if (guests.contains(name)) {
                    guests.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }

        for (String name : guests) {
            System.out.println(name);
        }

    }
}