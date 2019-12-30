package maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        Map<String, String> users = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {

            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            String username = input[1];

            if (command.equals("register")) {
                String license = input[2];

                if (!users.containsKey(username)) {
                    users.put(username, license);
                    System.out.printf("%s registered %s successfully%n",
                            username,
                            license);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n",
                            license);
                }

            } else {

                if (users.containsKey(username)) {
                    users.remove(username);
                    System.out.printf("%s unregistered successfully%n",
                            username);
                } else {
                    System.out.printf("ERROR: user %s not found%n",
                            username);
                }
            }
        }

        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.printf("%s => %s%n",
                    entry.getKey(),
                    entry.getValue());
        }

    }
}
